package aifanshahran.lab5a.class_adapters_p2;

class CAAddress {
    public boolean isValidCanadianAddr(String inp_address, String inp_pcode, String inp_prvnc){
        if (inp_address.trim().length() < 15)
            return false;
        if (inp_pcode.trim().length() != 6)
            return false;
        if (inp_prvnc.trim().length() < 6)
            return false;
        return true;
    }
} //end of class
