package org.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.Utility.CUtility;


public class Altromutual extends CUtility {
	public Altromutual() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="")
	private WebElement l;
	
	
	
	@FindBy(xpath="//font[@style='font-weight: bold; color: red;']")
	private WebElement signup;
	
	@FindBy(id="uid")
	private WebElement user;
	
	@FindBy(id="passw")
	private WebElement pass;
	
	public WebElement getL() {
		return l;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	@FindBy(name="btnSubmit")
	private WebElement btnSubmit;
	
	@FindBy(id="MenuHyperLink1")
	private WebElement summary;
	
	@FindBy(id="listAccounts")
	private WebElement Account;
	
	@FindBy(id="btnGetAccount")
	private WebElement go;
	
	@FindBy(xpath="(//table[@cellspacing='0'])[4]")
	private List<WebElement> tabledatas;
	
	@FindBy(id="MenuHyperLink3")
	private WebElement transferfunds;
	
	@FindBy(id="fromAccount")
	private WebElement fromAccount;
	
	@FindBy(id="toAccount")
	private WebElement toAccount;
	
	@FindBy(id="transferAmount")
	private WebElement transferAmount;
	
	@FindBy(id="transfer")
	private WebElement transfer;
	
	@FindBy(id="_ctl0__ctl0_Content_Main_postResp")
	private WebElement message;
	
	@FindBy(id="MenuHyperLink2")
	private WebElement recentTransction;
	
	@FindBy(id="_ctl0__ctl0_Content_Main_MyTransactions")
	private List<WebElement> secondtable ;
	
	@FindBy(id="HyperLink3")
	private WebElement contactus;
	
	@FindBy(xpath="//a[text()='online form']")
	private WebElement onlinefrom;
	
	@FindBy(name="comments")
	private WebElement comment;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	@FindBy(xpath="//font[text()='Sign Off']")
	private WebElement signoff;
	

	@FindBy(id="_ctl0__ctl0_Content_Main_message")
	private WebElement getErrormsg;
	
	@FindBy(xpath="//h2[text()='Congratulations! ']")
	private WebElement Successmsg;
	
	@FindBy(xpath="//h1[text()='Thank You']")
	private WebElement completemsg;
	
	@FindBy(xpath="(//tr)[10]")
	private WebElement Avalabile;
	
	@FindBy(xpath="(//tr)[8]")
	private WebElement frow;
	
	@FindBy(xpath="(//tr)[9]")
	private WebElement srow;
	
	@FindBy(id="AccountLink")
	private WebElement accountlink;
	
	

	public WebElement getAccountlink() {
		return accountlink;
	}

	public WebElement getFrow() {
		return frow;
	}

	public WebElement getSrow() {
		return srow;
	}

	public WebElement getAvalabile() {
		return Avalabile;
	}

	public WebElement getCompletemsg() {
		return completemsg;
	}

	public WebElement getTransferfunds() {
		return transferfunds;
	}

	public WebElement getSuccessmsg() {
		return Successmsg;
	}

	public WebElement getGetErrormsg() {
		return getErrormsg;
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getAccount() {
		return Account;
	}

	public WebElement getGo() {
		return go;
	}

	public List<WebElement> getTabledatas() {
		return tabledatas;
	}

	public WebElement getFromAccount() {
		return fromAccount;
	}

	public WebElement getToAccount() {
		return toAccount;
	}

	public WebElement getTransferAmount() {
		return transferAmount;
	}

	public WebElement getTransfer() {
		return transfer;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getRecentTransction() {
		return recentTransction;
	}

	public List<WebElement> getSecondtable() {
		return secondtable;
	}

	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getOnlinefrom() {
		return onlinefrom;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSignoff() {
		return signoff;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
