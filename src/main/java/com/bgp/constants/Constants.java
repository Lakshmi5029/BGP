package com.bgp.constants;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
public class Constants {
    public final String[] arr = new String[]{" The applicant has not made any payment to any supplier, vendor, or third party prior to applying for this grant ", "The applicant has not started work on this project", " The applicant has not signed any contractual agreement with any supplier, vendor, or third party prior to applying for this grant "};
    public static final String warningMsg = "The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants.";
    public static final String faqUrl = "https://www.gobusiness.gov.sg/business-grants-portal-faq/get-a-grant/";
    //Following enum can be moved to Json for easy maintenance
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum ELIGIBILITY_LABEL {
        APPLICANT_REGISTERED("Is the applicant registered in Singapore? * *", "react-eligibility-sg_registered_check-true", "react-eligibility-sg_registered_check-false"),
        TARGET_MARKET("Is the target market that you are applying for a new market? A market is new if your company's revenue from there has not exceeded $100,000 for any of the last 3 years. *target market", "react-eligibility-new_target_market_check-true", "react-eligibility-new_target_market_check-false"),
        MULTIPLE_STATEMENT("Are all the following statements true for this project? *\n" +
                "The applicant has not started work on this project\n" +
                "The applicant has not made any payment to any supplier, vendor, or third party prior to applying for this grant\n" +
                "The applicant has not signed any contractual agreement with any supplier, vendor, or third party prior to applying for this grant *", "react-eligibility-started_project_check-true", "react-eligibility-started_project_check-false"),
        LOCAL_EQUITY("Does the applicant have at least 30% local equity? *local equity", "react-eligibility-global_hq_check-true", "react-eligibility-global_hq_check-false"),
        GROUP_SALES("Is the applicant's group sales turnover less than or equal to S$100m or is the applicant's group employment size less than or equal to 200? * *", "react-eligibility-turnover_check-true", "react-eligibility-turnover_check-false");
        @Getter
        String label;
        @Getter
        String yesid, noid;
    }
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum grantActions {
        ELIGIBLITY("Eligibility"),
        CONTACT_DETAILS("Contact Details"),
        PROPOSAL("Proposal"),
        BUSINESS_IMPACT("Business Impact"),
        COST("Cost"),
        DECLARE_REVIEW("Declare & Review");
        @Getter
        String grantOption;
    }
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum SELECT_GRANT {
        BRING_MY_BUSINESS("Bring my business overseas or establish a stronger international presence"),
        UPGRADE_KEY_BUSINESS("Upgrade key business areas, such as adopt technology, improve business processes or raise service standards"),
        ENHANCE_TOURISTS("Enhance tourists' experience in Singapore");
        @Getter
        String selectGrantLabel;
    }
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum APPLY_GRANT {
        MARKET_READINESS_ASSISTANCE("Market Readiness Assistance"),
        MARKET_ACCESS("Market Access");
        @Getter
        String selectApplyGrant;
    }
    //can be added for another sectors also in future
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum SECTOR {
        IT("IT"),
        ABC("abc");
        @Getter
        String sector;
    }
}
