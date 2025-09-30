package agroquimico;

import java.util.ArrayList;

public class AgrosService {

    public ArrayList<ProductoQuimico>buscaproductoquimico(Enfermedad e,ArrayList<ProductoQuimico>Productos){
        ArrayList<ProductoQuimico> resultado = new ArrayList<>();
        for (ProductoQuimico p: Productos) {
            if (p.puedeTratarEnfermedad(e)){
                return resultado.add(p);
            }
        }
        return resultado;
    }



}
