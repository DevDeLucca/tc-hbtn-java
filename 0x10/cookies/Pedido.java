import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private ArrayList<PedidoCookie> cookies = new ArrayList<>();
    private int totalQuantidadeDeCaixas;
    private int totalDeCaixasRemovidas = 0;

    public Pedido() {

    }

    public List<PedidoCookie> adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
        return cookies;
    }

    public int obterTotalCaixas() {
        totalQuantidadeDeCaixas = 0;
        for (PedidoCookie pedidoCookie : cookies) {
            totalQuantidadeDeCaixas += pedidoCookie.getQuantidadeCaixas();
        }

        return totalQuantidadeDeCaixas;
    }

    public int removerSabor(String saborCookie) {
        totalDeCaixasRemovidas = 0;
        for (PedidoCookie pedidoCookie : cookies) {
            if (pedidoCookie.getSabor().equals(saborCookie)) {
                totalDeCaixasRemovidas += pedidoCookie.getQuantidadeCaixas();

            }
        }

        cookies.removeIf(pedido -> pedido.getSabor().equals(saborCookie));

        return totalDeCaixasRemovidas;
    }

}