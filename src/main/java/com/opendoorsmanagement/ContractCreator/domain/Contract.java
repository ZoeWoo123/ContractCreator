package com.opendoorsmanagement.ContractCreator.domain;

public class Contract {
    String greeting;
    String background;
    String whyyourproperty;
    String ouroffer;
    String ourjob;
    String regardingagreement;

    public Contract() {
        this.greeting = "I hope you and your family are well and that you find this letter the good news that I believe it is.";
        this.background = "For background, I have been in the energy, water and real estate business since 2004. I started Open Doors Management because I know how to identify land that can host solar, wind and energy storage systems. Additionally, my business network includes top-tier energy development companies who are now considering my land listings. I am asking you to sign the listing agreement at the end of this letter so I can offer your land to the energy development industry. ";
        this.whyyourproperty = "My firm has developed a comprehensive software system to identify property like yours situated near an electrical substation, the onramp to the electrical grid serving business and residents like you. This is the property we have identified together with the substation:";
        this.ouroffer = "You can expect anywhere from $400 to $900 per acre, per year over a 20 year period with an escalator for leasing your land. If you wish to sell your land, you can expect to obtain Fair Market Value.";
        this.ourjob = "My job is to represent your property to the many qualified energy developers who are developing in Colorado.";
        this.regardingagreement = "Please text me at 858-342-1415 with a photo of your signed agreement if you will sign it. If you will not sign it because you want to discuss it or propose a change, please call me. Please text me if you do not want to go forward for any reason so we know where you stand. If you would like to propose a change, please call me to discuss.";
    }

    public Contract(Contract c) {
        this.greeting = c.getGreeting();
        this.background = c.getBackground();
        this.whyyourproperty = c.getWhyyourproperty();
        this.ouroffer = c.getOuroffer();
        this.ourjob = c.getOurjob();
        this.regardingagreement = c.getRegardingagreement();
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getWhyyourproperty() {
        return whyyourproperty;
    }

    public void setWhyyourproperty(String whyyourproperty) {
        this.whyyourproperty = whyyourproperty;
    }

    public String getOuroffer() {
        return ouroffer;
    }

    public void setOuroffer(String ouroffer) {
        this.ouroffer = ouroffer;
    }

    public String getOurjob() {
        return ourjob;
    }

    public void setOurjob(String ourjob) {
        this.ourjob = ourjob;
    }

    public String getRegardingagreement() {
        return regardingagreement;
    }

    public void setRegardingagreement(String regardingagreement) {
        this.regardingagreement = regardingagreement;
    }
}
