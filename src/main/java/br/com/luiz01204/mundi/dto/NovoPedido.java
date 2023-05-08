package br.com.luiz01204.mundi.dto;

import jakarta.validation.constraints.NotBlank;

public record NovoPedido(
        @NotBlank(message = "Este campo não deve estar em branco!")
        String nomeProduto,
        @NotBlank(message = "Este campo não deve estar em branco!")
        String urlProduto,
        @NotBlank(message = "Este campo não deve estar em branco!")
        String urlImagem,
        String descricao
) {
}
