package beginners;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Stock {
	private String symbol;
	private String exchange;
	private long lotSize;
	private int tickSize;
	private boolean isRestricted;
	private BigDecimal price;

	public Stock(String symbol, String exchange, long lotSize, int tickSize,
			boolean isRestricted, BigDecimal price) {
		super();
		this.symbol = symbol;
		this.exchange = exchange;
		this.lotSize = lotSize;
		this.tickSize = tickSize;
		this.isRestricted = isRestricted;
		this.price = price;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((exchange == null) ? 0 : exchange.hashCode());
		result = prime * result + (isRestricted ? 1231 : 1237);
		result = prime * result + (int) (lotSize ^ (lotSize >>> 32));
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + tickSize;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || this.getClass() != obj.getClass()){
			return false;
		}
		Stock other = (Stock) obj;

		return  
				this.tickSize == other.tickSize && this.lotSize == other.lotSize && 
				this.isRestricted == other.isRestricted &&
				(this.symbol == other.symbol|| (this.symbol != null && this.symbol.equals(other.symbol)))&& 
				(this.exchange == other.exchange|| (this.exchange != null && this.exchange.equals(other.exchange))) &&
				(this.price == other.price|| (this.price != null && this.price.equals(other.price)));


	}*/
	
	@Override
    public boolean equals(Object obj){
		
        if (obj instanceof Stock) {
            Stock other = (Stock) obj;
            EqualsBuilder builder = new EqualsBuilder();
            builder.append(this.symbol, other.symbol);
            builder.append(this.exchange, other.exchange);
            builder.append(this.lotSize, other.lotSize);
            builder.append(this.tickSize, other.tickSize);
            builder.append(this.isRestricted, other.isRestricted);
            builder.append(this.price, other.price);
            return builder.isEquals();
        }
        return false;
    }
  
    @Override
    public int hashCode(){
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(symbol);
        builder.append(exchange);
        builder.append(lotSize);
        builder.append(tickSize);
        builder.append(isRestricted);
        builder.append(price);
        return builder.toHashCode();
    }
    
    public static void main(String args[]){
        Stock sony = new Stock("6758.T", "Tokyo Stock Exchange", 1000, 10, false, BigDecimal.valueOf(2200));
        Stock sony2 = new Stock("6758.T", "Tokyo Stock Exchange", 1000, 10, false, BigDecimal.valueOf(2200));

        System.out.println("Equals result: " + sony.equals(sony2));
        System.out.println("HashCode result: " + (sony.hashCode()== sony2.hashCode()));
    }
}
