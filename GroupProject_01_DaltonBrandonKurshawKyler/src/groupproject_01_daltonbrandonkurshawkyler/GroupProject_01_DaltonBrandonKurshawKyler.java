/*
 * Brandon Dalton & Kyler Kurshaw
 * 3/20/19
 * This program calculates profit of stock shares after fees.
 */
package groupproject_01_daltonbrandonkurshawkyler;
import javax.swing.JOptionPane;
public class GroupProject_01_DaltonBrandonKurshawKyler 
{

  
    public static void main(String[] args) 
    {
     int prompt;
     do
     {
     int choice = getOption();
     // 0 is whole number 1 is percentage
     
     
     if (choice == 0)
     {
     int shares = getShares();
     double purchasePrice = getPurchasePrice();
     double purchaseFeePercent = getPurchaseFeePercent();
     double wholeNumberSold = getWholeNumberSold(shares);
     double salePrice = getSalePrice();
     double sellFeePercent = getSellFeePercent();
     double stockValuePurchase = calculateStockValuePurchase(shares, 
             purchasePrice);
     double feeChargePurchase = calculateFeeChargePurchase(stockValuePurchase 
     , purchaseFeePercent);
     double totalPaid = calculateTotalPaid(stockValuePurchase,
              feeChargePurchase);
     double stockSold = calculateStockSold(shares, wholeNumberSold);
     double stockValueSell = calculateStockValueSell(shares, salePrice);
     double totalSell = calculateTotalSell(salePrice, stockSold);
     double feeChargeSell = calculateFeeChargeSell(totalSell, sellFeePercent);
     double sharesAfterSale = calculateSharesAfterSale(stockSold, shares);
     double stockValueAfterSale = calculateStockValueAfterSale(sharesAfterSale, 
             salePrice);
     double grossProfit = calculateGrossProfit(totalSell, feeChargeSell);
     double netProfit = calculateNetProfit(grossProfit, totalPaid);
     displaySummary(totalPaid, feeChargePurchase, shares, stockValuePurchase, 
             stockValueSell, grossProfit, feeChargeSell, 
     sharesAfterSale, stockValueAfterSale, netProfit);   
     }
     else
     {
     int shares = getShares();
     double purchasePrice = getPurchasePrice();
     double purchaseFeePercent = getPurchaseFeePercent();
     double percentSold = getPercentSold();
     double salePrice = getSalePrice();
     double sellFeePercent = getSellFeePercent();
     double stockValuePurchase = calculateStockValuePurchase(shares, 
             purchasePrice);
     double feeChargePurchase = calculateFeeChargePurchase(stockValuePurchase 
     , purchaseFeePercent);
     double totalPaid = calculateTotalPaid(stockValuePurchase,
              feeChargePurchase);
     double stockSold = calculateStockSold(shares, percentSold);
     double stockValueSell = calculateStockValueSell(shares, salePrice);
     double totalSell = calculateTotalSell(salePrice, stockSold);
     double feeChargeSell = calculateFeeChargeSell(totalSell, sellFeePercent);
     double sharesAfterSale = calculateSharesAfterSale(stockSold, shares);
     double stockValueAfterSale = calculateStockValueAfterSale(sharesAfterSale, 
             salePrice);
     double grossProfit = calculateGrossProfit(totalSell, feeChargeSell);
     double netProfit = calculateNetProfit(grossProfit, totalPaid);
     displaySummary(totalPaid, feeChargePurchase, shares, stockValuePurchase, 
             stockValueSell, grossProfit, feeChargeSell, 
     sharesAfterSale, stockValueAfterSale, netProfit);
     }
     
     prompt = JOptionPane.showConfirmDialog(null, "Do you want to run this "
             + "again?");
     } while (prompt == 0);
    
     
     
    }
    public static int getOption()
    {
      String[] options = {"Whole Numbers", "Percentage"};
      int choice = JOptionPane.showOptionDialog(null, "Chose how you want to "
              + "sell your shares.", "Click a button", 
              JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
              options, options[0]);
      return choice;
    }
    public static int getShares()
    {
        
     String inputString;
     int shares;
     inputString = JOptionPane.showInputDialog("How many shares did you "
             + "purcahse? ");
     shares = Integer.parseInt(inputString);
     while (shares < 1)
     {
         inputString = JOptionPane.showInputDialog("Invalid number entered. "
             + "\nPlease enter a positive number. ");
         shares = Integer.parseInt(inputString);
     }
     return shares;
     
    }
    public static double getPurchasePrice()
    {
     String inputString;
     double purchasePrice;
     inputString = JOptionPane.showInputDialog("How much was the stock per "
             + "share at time of purchase?");
     purchasePrice = Double.parseDouble(inputString);
     while (purchasePrice < 1)
     {
         inputString = JOptionPane.showInputDialog("Invalid number entered. "
             + "\nPlease enter a positive number. ");
         purchasePrice = Double.parseDouble(inputString);
     }
     return purchasePrice;
    }
    public static double getPurchaseFeePercent()
    {
      String inputString;
     double feeUserInput;
     double purchaseFeePercent;
     inputString = JOptionPane.showInputDialog("What was the fee charge percent"
             + "? ");
     feeUserInput = Double.parseDouble(inputString);
     while (feeUserInput < 1)
     {
         inputString = JOptionPane.showInputDialog("Invalid number entered. "
             + "\nPlease enter a positive number.(e.g. 15 for 15%) ");
         feeUserInput = Double.parseDouble(inputString);
         
     }
     purchaseFeePercent = feeUserInput / 100;
     return purchaseFeePercent;
    }
    public static double getPercentSold()
    {
      String inputString;
      double percentSoldUserInput;
      double percentSold;
      inputString = JOptionPane.showInputDialog("What percent of your stock are"
              + " you selling? ");
      percentSoldUserInput = Double.parseDouble(inputString);
      while (percentSoldUserInput < 1)
     {
         inputString = JOptionPane.showInputDialog("Invalid number entered."
             + "\nPlease enter a positive number(e.g. 15 for 15%). ");
         percentSoldUserInput = Double.parseDouble(inputString);
         
     }
      percentSold = percentSoldUserInput / 100;
      return percentSold;
    }
    public static double getWholeNumberSold(int shares)
    {
      String inputString;
      double wholeNumberSoldUserInput;
      double wholeNumberSold;
      inputString = JOptionPane.showInputDialog("How many shares do you want "
              + "to sell?");
      wholeNumberSoldUserInput = Double.parseDouble(inputString);
      while (wholeNumberSoldUserInput < 0)
     {
         inputString = JOptionPane.showInputDialog("Invalid number entered. "
             + "\nPlease enter a positive number. ");
         wholeNumberSoldUserInput = Double.parseDouble(inputString);
         
     }
      wholeNumberSold = wholeNumberSoldUserInput / shares;
      return wholeNumberSold; 
    }
    public static double getSalePrice()
    {
     String inputString;
     double salePrice;
     inputString = JOptionPane.showInputDialog("How much did you sell the stock"
             + " per share? ");
     salePrice = Double.parseDouble(inputString);
     while (salePrice < 0)
     {
         inputString = JOptionPane.showInputDialog("Invalid number entered. "
             + "\nPlease enter a positive number or 0 if giving away. ");
         salePrice = Double.parseDouble(inputString);
         
         
     }
     return salePrice;
    }
    public static double getSellFeePercent()
    {
    String inputString;
    double sellFeeUserInput;
    double sellFeePercent;
    inputString = JOptionPane.showInputDialog("What was the sell fee percent?"
            + " ");
    sellFeeUserInput = Double.parseDouble(inputString);
    while (sellFeeUserInput < 1)
     {
         inputString = JOptionPane.showInputDialog("Invalid number entered. "
             + "\nPlease enter a positive number.(e.g. 15 for 15%) ");
         sellFeeUserInput = Double.parseDouble(inputString);         
         
     }
    sellFeePercent = sellFeeUserInput / 100;
    return sellFeePercent;
    }
    public static double calculateStockValuePurchase(double shares , 
            double purchasePrice)
    {
        double stockValuePurchase = shares * purchasePrice;
        return stockValuePurchase;
    }
    public static double calculateFeeChargePurchase(double stockValuePurchase , 
          double purchaseFeePercent)
    {
     double feeChargePurchase = stockValuePurchase * purchaseFeePercent;
     
     return feeChargePurchase;
     
    }
    public static double calculateTotalPaid(double stockValuePurchase
     , double feeChargePurchase)
    {
        double  totalPaid = stockValuePurchase + feeChargePurchase;
        return totalPaid;
    }
    public static double calculateStockSold(double shares , double percentSold)
    {
     double stockSold = shares * percentSold;
     return stockSold;
    }
    public static double calculateStockValueSell(double shares , 
            double salePrice)
    {
        double stockValueSell = shares * salePrice;
        return stockValueSell;
    }
    public static double calculateTotalSell(double salePrice , double stockSold)
    {
     double totalSell = salePrice * stockSold;
     return totalSell;
    }
    public static double calculateFeeChargeSell(double totalSell , 
            double sellFeePercent)
    {
        double feeChargeSell = totalSell * sellFeePercent;
        return feeChargeSell;
    }
    public static double calculateSharesAfterSale(double stockSold , 
            double shares)
    {
        double sharesAfterSale = shares - stockSold;
        return sharesAfterSale;
    }
    public static double calculateStockValueAfterSale(double sharesAfter , 
            double salePrice)
    {
       double stockValueAfterSale = sharesAfter * salePrice;
       return stockValueAfterSale;
    }
    public static double calculateGrossProfit(double totalSell ,
            double feeChargeSell)
    {
        double grossProfit = totalSell - feeChargeSell;
        return grossProfit;
    }
    public static double calculateNetProfit(double grossProfit,
            double totalPaid)
    {
      double netProfit = grossProfit - totalPaid;
      return netProfit;
    }
    public static void displaySummary(double totalPaid ,
            double feeChargePurchase , double shares , double stockValuePurchase
     , double stockValueSell , double grossProfit , double feeChargeSell , 
     double sharesAfterSale , double stockValueAfterSale , double netProfit)
    {
        JOptionPane.showMessageDialog(null,
        "-------------------Purchase Summary-------------------"
        + String.format("\nTotal paid for shares: $%,.2f", totalPaid)
        + String.format("\nFee charge: $%,.2f", feeChargePurchase)        
        + "\nNumber of shares owned after purchase: " + shares
        + String.format(" stock value: $%,.2f", stockValuePurchase)
        + "\n-------------------Selling Summary-------------------"
        + "\nNumber of shares owned before sale: " + shares
        + String.format(" stock value: $%,.2f", stockValueSell)
        + String.format("\nAmount stock sold for: $%,.2f", grossProfit)
        + String.format("\nSelling fee charge: $%,.2f", feeChargeSell)
        + String.format("\nNumber of shares owned after sale: %,.1f", 
                sharesAfterSale)
        + String.format(" stock value: $%,.2f", stockValueAfterSale)
        + String.format("\nNet Profit: $%,.2f", netProfit));
    }
}
