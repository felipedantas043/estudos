package locadora;

import java.text.SimpleDateFormat;

public class dvd extends ItemAbstrato{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    @Override
    public void cadastrar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
    }

    @Override
    public void emprestar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emprestar'");
    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolver'");
    }

}
