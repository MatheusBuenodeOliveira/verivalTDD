public class Money {
   protected int amount;
   private String currency;

   public static Money dollar(int amount) {
       return new Money(amount, "USD");
   }

   public static Money franc(int amount) {
       return new Money(amount, "CHF");
   }

   Money(int amount, String currency) {
       this.amount = amount;
       this.currency = currency;
   }

   Money times(int multiplier) {
       return new Money(amount * multiplier, currency);
   }

   String currency() {
       return currency;
   }

   @Override
   public boolean equals(Object object) {
       Money money = (Money) object;
       return amount == money.amount && currency.equals(money.currency);
   }
}
