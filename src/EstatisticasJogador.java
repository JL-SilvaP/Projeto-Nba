public class EstatisticasJogador {
    private int jogosJogados;
    private double ppgCarreira;
    private double apgCarreira;
    private double rpgCarreira;
    private double spgCarreira;
    private double bpgCarreira;

    public int getJogosJogados() {
        return jogosJogados;
    }

    public void setJogosJogados(int jogosJogados) {
        if (jogosJogados >= 0) {
            this.jogosJogados = jogosJogados;
        }
    }

    public double getPpgCarreira() {
        return ppgCarreira;
    }

    public void setPpgCarreira(double ppgCarreira) {
        if (ppgCarreira >= 0) {
            this.ppgCarreira = ppgCarreira;
        }
    }

    public double getApgCarreira() {
        return apgCarreira;
    }

    public void setApgCarreira(double apgCarreira) {
        if (apgCarreira >= 0) {
            this.apgCarreira = apgCarreira;
        }
    }

    public double getRpgCarreira() {
        return rpgCarreira;
    }

    public void setRpgCarreira(double rpgCarreira) {
        if (rpgCarreira >= 0) {
            this.rpgCarreira = rpgCarreira;
        }
    }

    public double getSpgCarreira() {
        return spgCarreira;
    }

    public void setSpgCarreira(double spgCarreira) {
        if (spgCarreira >= 0) {
            this.spgCarreira = spgCarreira;
        }
    }

    public double getBpgCarreira() {
        return bpgCarreira;
    }

    public void setBpgCarreira(double bpgCarreira) {
        if (bpgCarreira >= 0) {
            this.bpgCarreira = bpgCarreira;
        }
    }
    }
