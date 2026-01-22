package br.com.jogo.model;

public enum GameStatusEnum {
    NOT_STARTED("não iniciado"),
    SUCCEEDED("bem sucedido"),
    FAILED("falhou");

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    private String label;

    GameStatusEnum(final String label) {
        this.label = label;
    }
}
