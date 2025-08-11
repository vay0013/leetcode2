class ATM {
    private int[] nominals;
    private long[] counts;

    public ATM() {
        this.nominals = new int[]{20, 50, 100, 200, 500};
        this.counts = new long[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            counts[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] delivery = new int[5];
        long curAmount = amount;
        for (int i = 4; i > -1; i--) {
            if (curAmount > nominals[i]*counts[i]) {
                delivery[i] = (int) counts[i];
            } else {
                delivery[i] = (int) curAmount / nominals[i];
            }

            curAmount -= (long) nominals[i]*delivery[i];
            if (curAmount == 0) {
                break;
            }
        }
        if (curAmount > 0) {
            return new int[]{-1};
        }
        for (int i = 0; i < 5; i++) {
            counts[i] -= delivery[i];
        }
        return delivery;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */