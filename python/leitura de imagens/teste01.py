import cv2 as cv
from PIL import Image
import pytesseract as py
from pytesseract import Output

img = cv.imread("/home/felipe/Documents/estudos/python/leitura de imagens/Ticket.jpg")

d = py.image_to_data(img, output_type=Output.DICT)
n_boxes = len(d['level'])
for i in range(n_boxes):
    (x, y, w, h) = (d['left'][i], d['top'][i], d['width'][i], d['height'][i])
    cv.rectangle(img, (x, y), (x + w, y + h), (0, 255, 0), 2)

cv.namedWindow("output", cv.WINDOW_NORMAL)
imgS = cv.resize(img, (500, 500))
cv.imshow("img", imgS)
cv.waitKey(0)