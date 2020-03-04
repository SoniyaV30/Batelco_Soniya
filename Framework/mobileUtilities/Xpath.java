package mobileUtilities;

import Libraries.Driver;

public class Xpath extends Driver {
	// verifyMCareLogin Paths
	static String okButton = "//*[@resource-id='" + activity.get() + ":id/permission_accept_button']";
	static String VFlogo = "//*[@resource-id='" + activity.get() + ":id/logo_vodafone']";
	static String VoV = "//*[@resource-id='" + activity.get() + ":id/voice_of_vodafone']";
//	static String VoV = "//android.widget.TextView[contains(@text,'VOV Test')]";
	static String BurgerMenu = "//*[@resource-id='" + activity.get() + ":id/burger_menu']";
	static String NeedHelp = "//*[@resource-id='" + activity.get() + ":id/dashboard_need_help']";
	static String GaugeLayout = "//*[@resource-id='" + activity.get() + ":id/gauge_circle_layout']";
	static String SkipTutorial = "//android.widget.TextView[contains(@text,'Skip')]";
	static String AlertCancel = "android:id/button2";
	static String MenuVFPoints = "//*[contains(@text,'Vodafone Points')]";
	static String CookieValue = "//android.widget.TextView[contains(@content-desc,'ltr.cookies.points.text')]";
	static String Recharge = "//*[contains(@text,'Recharge Credit and Data')]";
	static String Recharge1 = "//*[contains(@text,'Recharge Credit & Data')]";
	static String RechargeMSISDN = "qa.vodafone.myvodafone.devel.beta:id/msisdn_input_field";
	static String BucketCall = "qa.vodafone.myvodafone.devel.beta:id/mins";
	static String BucketData = "qa.vodafone.myvodafone.devel.beta:id/data";
	static String BucketSMS = "qa.vodafone.myvodafone.devel.beta:id/sms";
	static String BucketValue = "ltr.dashboard.gauge.circle_pager_view.balance.text";
	static String BucketName = ":id/bucket_name";
	static String gauge = "ltr.dashboard.gauge.circle_pager_view.vertical";
	static String BillingPayments = "//android.widget.TextView[contains(@text,'Billing and Payment')]";
	static String QuickPay = "//android.widget.TextView[contains(@text,'Quick Pay')]";
	static String QuickPayMSISDN = "//*[@class='android.widget.EditText' and @index='1']";
	static String QuickPayAmount = "//android.widget.EditText[contains(@text,'insert amount')]";
	static String QuickPayByFalcon = "//android.widget.TextView[contains(@text,'Pay by Falcon')]";
	static String Payment = "//*[contains(@text,'Pay by Falcon')]";
	static String ProductServices = "//android.widget.TextView[contains(@text,'My Products & Services')]";
	static String MyBill = "//android.widget.TextView[contains(@text,'My Bill')]";
	static String CurrentSP = "//android.widget.TextView[contains(@text,'Current spend & bill')]";
	static String PS_Phone = "//android.widget.TextView[contains(@text,'Your phone')]";
	static String TT = "//android.widget.TextView[contains(@text,'Trouble tickets')]";
	static String TT1 = "//android.widget.TextView[contains(@text,'Trouble Tickets')]";
	static String Env = "//*[@class='android.widget.ImageView']";
	static String MsisdnEntry = "//android.widget.EditText[@NAF='true' and @index='1']";
	static String Switchbutton = "//*[contains(@text,'Mobile Data Internet Conn')]/..//*[contains(@text,'OFF')]";
	static String Login = "//android.widget.TextView[contains(@text,'Login')]";
	static String QuickPay1 = "//android.widget.TextView[contains(@text,'Quick pay')]";
	static String MyInbox = "//android.widget.TextView[contains(@text,'My Inbox')]";
	static String NeedHp = "//android.widget.TextView[contains(@text,'Need Help?')]";
	static String Tutorial = "//android.widget.TextView[contains(@text,'Tutorial')]";
	static String Settings = "//android.widget.TextView[contains(@text,'Settings')]";
	static String Home = "//android.widget.TextView[contains(@text,'Home')]";
	static String AskHani = "//*[@text='Ask Hani' and @index='0']";
	static String Cancel = "//*[@NAF='true']";
	static String Menu = "//*[@resource-id='" + activity.get() + ":id/burger_menu' and @index='1']";
	static String MSISDN_OTP = "//*[@resource-id='" + activity.get() + ":id/connect_msisdn_input']";
	static String LoginwithSMS = "//*[@resource-id='qa.vodafone.myvodafone:id/connect_login_with_otp_button']";
	static String GetOTP = "//*[@resource-id='" + activity.get() + ":id/connect_get_otp_button']";
	static String OKButton = "//*[@resource-id='" + activity.get() + ":id/permission_accept_button']";
	static String PayBill = "//android.widget.TextView[contains(@text,'Pay your bill')]";
	static String Retrivepay = "//android.widget.TextView[contains(@text,'Pay bill')]";
	static String Oustanding = "//*[contains(@text,'Total outstanding on')]/..//*[@index='1']";
	static String Logout = "//android.widget.TextView[contains(@text,'Logout')]";
	static String AvatarScreen = "//android.widget.TextView[contains(@text,'Change avatar')]";
	static String LogoutConfirmation = "//android.widget.TextView[contains(@text,'Confirm')]";
	static String retrivebill = "//android.widget.TextView[contains(@text,'Retrieve a bill & pay')]";
	static String ACCNum = "//android.widget.EditText[contains(@text,'Vodafone number or Account number')]";
	static String IDNum = "//android.widget.EditText[contains(@text,'Qatari I.D. or Passport Number')]";
	static String Retrive = "//android.widget.TextView[contains(@text,'Retrieve & Pay')]";
	static String Debit = "//*[@class='android.widget.FrameLayout' and @index='0']/[@NAF='true' and index='8']";
	static String Credit = "//*[@class='android.widget.FrameLayout' and @index='1']/[@NAF='true' and index='10']";
	static String Debitcard = "//*[contains(@text,'Debit card')]/..//*[@NAF='true']";
	static String Creditcard = "//*[contains(@text,'Credit card')]/..//*[@NAF='true']";
}