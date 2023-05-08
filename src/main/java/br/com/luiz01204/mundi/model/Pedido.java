package br.com.luiz01204.mundi.model;

import br.com.luiz01204.mundi.dto.NovoPedido;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Entity(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeProduto;
    private BigDecimal valor;
    private LocalDate dataDaEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public Pedido(NovoPedido dados){
        this.nomeProduto = dados.nomeProduto();
        this.urlProduto = dados.urlProduto();
        this.urlImagem = dados.urlImagem();
        this.descricao = dados.descricao();
    }
}

