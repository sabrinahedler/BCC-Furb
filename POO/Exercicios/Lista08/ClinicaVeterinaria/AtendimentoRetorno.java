package ClinicaVeterinaria;

import java.time.LocalDate;

public class AtendimentoRetorno extends Atendimento {
    private Atendimento atendimentoAnterior;

    public AtendimentoRetorno(LocalDate data, String descricao, Veterinario veterinario, Animal animal, Atendimento atendimentoAnterior) {
        super(data, descricao, veterinario, animal);
        this.atendimentoAnterior = atendimentoAnterior;
    }

    public Atendimento getAtendimentoAnterior() {
        return atendimentoAnterior;
    }

    public void setAtendimentoAnterior(Atendimento atendimentoAnterior) {
        this.atendimentoAnterior = atendimentoAnterior;
    }

    @Override
    public void registrar() {
        System.out.println("Consulta de retorno registrada para " + getAnimal().getNome() + ", referente à consulta anterior em " + atendimentoAnterior.getData() + ".");
    }
}
