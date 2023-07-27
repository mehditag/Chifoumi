public enum Chifoumi {
    PIERRE,
    FEUILLE,
    CISEAU;

    public boolean bats(Chifoumi adversaire){
        switch (this){
            case PIERRE :
                return adversaire == CISEAU;
            case FEUILLE :
                return adversaire==PIERRE;
            case CISEAU :
                return adversaire==FEUILLE;
            default : return false;
        }
    }
}
