import java.util.HashMap;

public class IDandPasswords {
    
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    
    //construct
    IDandPasswords() {
        
        loginInfo.put("Joe Vega", "viperr");
        loginInfo.put("Callahan", "mustangt");
        loginInfo.put("Kaze", "mclerinn");
    }
    
    //method
    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
