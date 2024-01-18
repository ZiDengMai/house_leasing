package leasing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TenantsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TenantsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTenantsIdIsNull() {
            addCriterion("tenants_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantsIdIsNotNull() {
            addCriterion("tenants_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantsIdEqualTo(String value) {
            addCriterion("tenants_id =", value, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdNotEqualTo(String value) {
            addCriterion("tenants_id <>", value, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdGreaterThan(String value) {
            addCriterion("tenants_id >", value, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenants_id >=", value, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdLessThan(String value) {
            addCriterion("tenants_id <", value, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdLessThanOrEqualTo(String value) {
            addCriterion("tenants_id <=", value, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdLike(String value) {
            addCriterion("tenants_id like", value, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdNotLike(String value) {
            addCriterion("tenants_id not like", value, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdIn(List<String> values) {
            addCriterion("tenants_id in", values, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdNotIn(List<String> values) {
            addCriterion("tenants_id not in", values, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdBetween(String value1, String value2) {
            addCriterion("tenants_id between", value1, value2, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andTenantsIdNotBetween(String value1, String value2) {
            addCriterion("tenants_id not between", value1, value2, "tenantsId");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andSsnIsNull() {
            addCriterion("ssn is null");
            return (Criteria) this;
        }

        public Criteria andSsnIsNotNull() {
            addCriterion("ssn is not null");
            return (Criteria) this;
        }

        public Criteria andSsnEqualTo(String value) {
            addCriterion("ssn =", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotEqualTo(String value) {
            addCriterion("ssn <>", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThan(String value) {
            addCriterion("ssn >", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThanOrEqualTo(String value) {
            addCriterion("ssn >=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThan(String value) {
            addCriterion("ssn <", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThanOrEqualTo(String value) {
            addCriterion("ssn <=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLike(String value) {
            addCriterion("ssn like", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotLike(String value) {
            addCriterion("ssn not like", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnIn(List<String> values) {
            addCriterion("ssn in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotIn(List<String> values) {
            addCriterion("ssn not in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnBetween(String value1, String value2) {
            addCriterion("ssn between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotBetween(String value1, String value2) {
            addCriterion("ssn not between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("`source` is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("`source` is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("`source` =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("`source` <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("`source` >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("`source` >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("`source` <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("`source` <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("`source` like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("`source` not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("`source` in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("`source` not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("`source` between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("`source` not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andBackgroundIsNull() {
            addCriterion("background is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundIsNotNull() {
            addCriterion("background is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundEqualTo(String value) {
            addCriterion("background =", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotEqualTo(String value) {
            addCriterion("background <>", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundGreaterThan(String value) {
            addCriterion("background >", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("background >=", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLessThan(String value) {
            addCriterion("background <", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLessThanOrEqualTo(String value) {
            addCriterion("background <=", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLike(String value) {
            addCriterion("background like", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotLike(String value) {
            addCriterion("background not like", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundIn(List<String> values) {
            addCriterion("background in", values, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotIn(List<String> values) {
            addCriterion("background not in", values, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundBetween(String value1, String value2) {
            addCriterion("background between", value1, value2, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotBetween(String value1, String value2) {
            addCriterion("background not between", value1, value2, "background");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToIsNull() {
            addCriterion("custom_source_commission_to is null");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToIsNotNull() {
            addCriterion("custom_source_commission_to is not null");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToEqualTo(String value) {
            addCriterion("custom_source_commission_to =", value, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToNotEqualTo(String value) {
            addCriterion("custom_source_commission_to <>", value, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToGreaterThan(String value) {
            addCriterion("custom_source_commission_to >", value, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToGreaterThanOrEqualTo(String value) {
            addCriterion("custom_source_commission_to >=", value, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToLessThan(String value) {
            addCriterion("custom_source_commission_to <", value, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToLessThanOrEqualTo(String value) {
            addCriterion("custom_source_commission_to <=", value, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToLike(String value) {
            addCriterion("custom_source_commission_to like", value, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToNotLike(String value) {
            addCriterion("custom_source_commission_to not like", value, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToIn(List<String> values) {
            addCriterion("custom_source_commission_to in", values, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToNotIn(List<String> values) {
            addCriterion("custom_source_commission_to not in", values, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToBetween(String value1, String value2) {
            addCriterion("custom_source_commission_to between", value1, value2, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andCustomSourceCommissionToNotBetween(String value1, String value2) {
            addCriterion("custom_source_commission_to not between", value1, value2, "customSourceCommissionTo");
            return (Criteria) this;
        }

        public Criteria andSpecialistIsNull() {
            addCriterion("specialist is null");
            return (Criteria) this;
        }

        public Criteria andSpecialistIsNotNull() {
            addCriterion("specialist is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialistEqualTo(String value) {
            addCriterion("specialist =", value, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistNotEqualTo(String value) {
            addCriterion("specialist <>", value, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistGreaterThan(String value) {
            addCriterion("specialist >", value, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistGreaterThanOrEqualTo(String value) {
            addCriterion("specialist >=", value, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistLessThan(String value) {
            addCriterion("specialist <", value, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistLessThanOrEqualTo(String value) {
            addCriterion("specialist <=", value, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistLike(String value) {
            addCriterion("specialist like", value, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistNotLike(String value) {
            addCriterion("specialist not like", value, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistIn(List<String> values) {
            addCriterion("specialist in", values, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistNotIn(List<String> values) {
            addCriterion("specialist not in", values, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistBetween(String value1, String value2) {
            addCriterion("specialist between", value1, value2, "specialist");
            return (Criteria) this;
        }

        public Criteria andSpecialistNotBetween(String value1, String value2) {
            addCriterion("specialist not between", value1, value2, "specialist");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}