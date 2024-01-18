package leasing.entity;

import java.util.ArrayList;
import java.util.List;

public class User_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User_infoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEarnedIsNull() {
            addCriterion("earned is null");
            return (Criteria) this;
        }

        public Criteria andEarnedIsNotNull() {
            addCriterion("earned is not null");
            return (Criteria) this;
        }

        public Criteria andEarnedEqualTo(Integer value) {
            addCriterion("earned =", value, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedNotEqualTo(Integer value) {
            addCriterion("earned <>", value, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedGreaterThan(Integer value) {
            addCriterion("earned >", value, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedGreaterThanOrEqualTo(Integer value) {
            addCriterion("earned >=", value, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedLessThan(Integer value) {
            addCriterion("earned <", value, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedLessThanOrEqualTo(Integer value) {
            addCriterion("earned <=", value, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedIn(List<Integer> values) {
            addCriterion("earned in", values, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedNotIn(List<Integer> values) {
            addCriterion("earned not in", values, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedBetween(Integer value1, Integer value2) {
            addCriterion("earned between", value1, value2, "earned");
            return (Criteria) this;
        }

        public Criteria andEarnedNotBetween(Integer value1, Integer value2) {
            addCriterion("earned not between", value1, value2, "earned");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNull() {
            addCriterion("performance is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNotNull() {
            addCriterion("performance is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceEqualTo(Integer value) {
            addCriterion("performance =", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotEqualTo(Integer value) {
            addCriterion("performance <>", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThan(Integer value) {
            addCriterion("performance >", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("performance >=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThan(Integer value) {
            addCriterion("performance <", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThanOrEqualTo(Integer value) {
            addCriterion("performance <=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceIn(List<Integer> values) {
            addCriterion("performance in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotIn(List<Integer> values) {
            addCriterion("performance not in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceBetween(Integer value1, Integer value2) {
            addCriterion("performance between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotBetween(Integer value1, Integer value2) {
            addCriterion("performance not between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketIsNull() {
            addCriterion("money_is_almost_in_your_pocket is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketIsNotNull() {
            addCriterion("money_is_almost_in_your_pocket is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketEqualTo(Double value) {
            addCriterion("money_is_almost_in_your_pocket =", value, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketNotEqualTo(Double value) {
            addCriterion("money_is_almost_in_your_pocket <>", value, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketGreaterThan(Double value) {
            addCriterion("money_is_almost_in_your_pocket >", value, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketGreaterThanOrEqualTo(Double value) {
            addCriterion("money_is_almost_in_your_pocket >=", value, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketLessThan(Double value) {
            addCriterion("money_is_almost_in_your_pocket <", value, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketLessThanOrEqualTo(Double value) {
            addCriterion("money_is_almost_in_your_pocket <=", value, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketIn(List<Double> values) {
            addCriterion("money_is_almost_in_your_pocket in", values, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketNotIn(List<Double> values) {
            addCriterion("money_is_almost_in_your_pocket not in", values, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketBetween(Double value1, Double value2) {
            addCriterion("money_is_almost_in_your_pocket between", value1, value2, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andMoneyIsAlmostInYourPocketNotBetween(Double value1, Double value2) {
            addCriterion("money_is_almost_in_your_pocket not between", value1, value2, "moneyIsAlmostInYourPocket");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessIsNull() {
            addCriterion("leasing_in_process is null");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessIsNotNull() {
            addCriterion("leasing_in_process is not null");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessEqualTo(Integer value) {
            addCriterion("leasing_in_process =", value, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessNotEqualTo(Integer value) {
            addCriterion("leasing_in_process <>", value, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessGreaterThan(Integer value) {
            addCriterion("leasing_in_process >", value, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessGreaterThanOrEqualTo(Integer value) {
            addCriterion("leasing_in_process >=", value, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessLessThan(Integer value) {
            addCriterion("leasing_in_process <", value, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessLessThanOrEqualTo(Integer value) {
            addCriterion("leasing_in_process <=", value, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessIn(List<Integer> values) {
            addCriterion("leasing_in_process in", values, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessNotIn(List<Integer> values) {
            addCriterion("leasing_in_process not in", values, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessBetween(Integer value1, Integer value2) {
            addCriterion("leasing_in_process between", value1, value2, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andLeasingInProcessNotBetween(Integer value1, Integer value2) {
            addCriterion("leasing_in_process not between", value1, value2, "leasingInProcess");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Integer value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Integer value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Integer value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Integer value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Integer> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Integer> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Integer value1, Integer value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andChangePriceIsNull() {
            addCriterion("change_price is null");
            return (Criteria) this;
        }

        public Criteria andChangePriceIsNotNull() {
            addCriterion("change_price is not null");
            return (Criteria) this;
        }

        public Criteria andChangePriceEqualTo(Integer value) {
            addCriterion("change_price =", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotEqualTo(Integer value) {
            addCriterion("change_price <>", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceGreaterThan(Integer value) {
            addCriterion("change_price >", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_price >=", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceLessThan(Integer value) {
            addCriterion("change_price <", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceLessThanOrEqualTo(Integer value) {
            addCriterion("change_price <=", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceIn(List<Integer> values) {
            addCriterion("change_price in", values, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotIn(List<Integer> values) {
            addCriterion("change_price not in", values, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceBetween(Integer value1, Integer value2) {
            addCriterion("change_price between", value1, value2, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("change_price not between", value1, value2, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoIsNull() {
            addCriterion("change_leasing_info is null");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoIsNotNull() {
            addCriterion("change_leasing_info is not null");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoEqualTo(Integer value) {
            addCriterion("change_leasing_info =", value, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoNotEqualTo(Integer value) {
            addCriterion("change_leasing_info <>", value, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoGreaterThan(Integer value) {
            addCriterion("change_leasing_info >", value, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_leasing_info >=", value, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoLessThan(Integer value) {
            addCriterion("change_leasing_info <", value, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoLessThanOrEqualTo(Integer value) {
            addCriterion("change_leasing_info <=", value, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoIn(List<Integer> values) {
            addCriterion("change_leasing_info in", values, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoNotIn(List<Integer> values) {
            addCriterion("change_leasing_info not in", values, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoBetween(Integer value1, Integer value2) {
            addCriterion("change_leasing_info between", value1, value2, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andChangeLeasingInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("change_leasing_info not between", value1, value2, "changeLeasingInfo");
            return (Criteria) this;
        }

        public Criteria andPriceApproveIsNull() {
            addCriterion("price_approve is null");
            return (Criteria) this;
        }

        public Criteria andPriceApproveIsNotNull() {
            addCriterion("price_approve is not null");
            return (Criteria) this;
        }

        public Criteria andPriceApproveEqualTo(Integer value) {
            addCriterion("price_approve =", value, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveNotEqualTo(Integer value) {
            addCriterion("price_approve <>", value, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveGreaterThan(Integer value) {
            addCriterion("price_approve >", value, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_approve >=", value, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveLessThan(Integer value) {
            addCriterion("price_approve <", value, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveLessThanOrEqualTo(Integer value) {
            addCriterion("price_approve <=", value, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveIn(List<Integer> values) {
            addCriterion("price_approve in", values, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveNotIn(List<Integer> values) {
            addCriterion("price_approve not in", values, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveBetween(Integer value1, Integer value2) {
            addCriterion("price_approve between", value1, value2, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andPriceApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("price_approve not between", value1, value2, "priceApprove");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseIsNull() {
            addCriterion("confirm_reverse is null");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseIsNotNull() {
            addCriterion("confirm_reverse is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseEqualTo(Integer value) {
            addCriterion("confirm_reverse =", value, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseNotEqualTo(Integer value) {
            addCriterion("confirm_reverse <>", value, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseGreaterThan(Integer value) {
            addCriterion("confirm_reverse >", value, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_reverse >=", value, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseLessThan(Integer value) {
            addCriterion("confirm_reverse <", value, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_reverse <=", value, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseIn(List<Integer> values) {
            addCriterion("confirm_reverse in", values, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseNotIn(List<Integer> values) {
            addCriterion("confirm_reverse not in", values, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseBetween(Integer value1, Integer value2) {
            addCriterion("confirm_reverse between", value1, value2, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmReverseNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_reverse not between", value1, value2, "confirmReverse");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalIsNull() {
            addCriterion("confirm_final is null");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalIsNotNull() {
            addCriterion("confirm_final is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalEqualTo(Integer value) {
            addCriterion("confirm_final =", value, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalNotEqualTo(Integer value) {
            addCriterion("confirm_final <>", value, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalGreaterThan(Integer value) {
            addCriterion("confirm_final >", value, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_final >=", value, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalLessThan(Integer value) {
            addCriterion("confirm_final <", value, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_final <=", value, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalIn(List<Integer> values) {
            addCriterion("confirm_final in", values, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalNotIn(List<Integer> values) {
            addCriterion("confirm_final not in", values, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalBetween(Integer value1, Integer value2) {
            addCriterion("confirm_final between", value1, value2, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andConfirmFinalNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_final not between", value1, value2, "confirmFinal");
            return (Criteria) this;
        }

        public Criteria andTourApprovalIsNull() {
            addCriterion("tour_approval is null");
            return (Criteria) this;
        }

        public Criteria andTourApprovalIsNotNull() {
            addCriterion("tour_approval is not null");
            return (Criteria) this;
        }

        public Criteria andTourApprovalEqualTo(Integer value) {
            addCriterion("tour_approval =", value, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalNotEqualTo(Integer value) {
            addCriterion("tour_approval <>", value, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalGreaterThan(Integer value) {
            addCriterion("tour_approval >", value, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalGreaterThanOrEqualTo(Integer value) {
            addCriterion("tour_approval >=", value, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalLessThan(Integer value) {
            addCriterion("tour_approval <", value, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalLessThanOrEqualTo(Integer value) {
            addCriterion("tour_approval <=", value, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalIn(List<Integer> values) {
            addCriterion("tour_approval in", values, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalNotIn(List<Integer> values) {
            addCriterion("tour_approval not in", values, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalBetween(Integer value1, Integer value2) {
            addCriterion("tour_approval between", value1, value2, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andTourApprovalNotBetween(Integer value1, Integer value2) {
            addCriterion("tour_approval not between", value1, value2, "tourApproval");
            return (Criteria) this;
        }

        public Criteria andParkingManageIsNull() {
            addCriterion("parking_manage is null");
            return (Criteria) this;
        }

        public Criteria andParkingManageIsNotNull() {
            addCriterion("parking_manage is not null");
            return (Criteria) this;
        }

        public Criteria andParkingManageEqualTo(Integer value) {
            addCriterion("parking_manage =", value, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageNotEqualTo(Integer value) {
            addCriterion("parking_manage <>", value, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageGreaterThan(Integer value) {
            addCriterion("parking_manage >", value, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_manage >=", value, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageLessThan(Integer value) {
            addCriterion("parking_manage <", value, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageLessThanOrEqualTo(Integer value) {
            addCriterion("parking_manage <=", value, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageIn(List<Integer> values) {
            addCriterion("parking_manage in", values, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageNotIn(List<Integer> values) {
            addCriterion("parking_manage not in", values, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageBetween(Integer value1, Integer value2) {
            addCriterion("parking_manage between", value1, value2, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andParkingManageNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_manage not between", value1, value2, "parkingManage");
            return (Criteria) this;
        }

        public Criteria andAdminPanelIsNull() {
            addCriterion("admin_panel is null");
            return (Criteria) this;
        }

        public Criteria andAdminPanelIsNotNull() {
            addCriterion("admin_panel is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPanelEqualTo(Integer value) {
            addCriterion("admin_panel =", value, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelNotEqualTo(Integer value) {
            addCriterion("admin_panel <>", value, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelGreaterThan(Integer value) {
            addCriterion("admin_panel >", value, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_panel >=", value, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelLessThan(Integer value) {
            addCriterion("admin_panel <", value, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelLessThanOrEqualTo(Integer value) {
            addCriterion("admin_panel <=", value, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelIn(List<Integer> values) {
            addCriterion("admin_panel in", values, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelNotIn(List<Integer> values) {
            addCriterion("admin_panel not in", values, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelBetween(Integer value1, Integer value2) {
            addCriterion("admin_panel between", value1, value2, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andAdminPanelNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_panel not between", value1, value2, "adminPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelIsNull() {
            addCriterion("salary_panel is null");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelIsNotNull() {
            addCriterion("salary_panel is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelEqualTo(Integer value) {
            addCriterion("salary_panel =", value, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelNotEqualTo(Integer value) {
            addCriterion("salary_panel <>", value, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelGreaterThan(Integer value) {
            addCriterion("salary_panel >", value, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_panel >=", value, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelLessThan(Integer value) {
            addCriterion("salary_panel <", value, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelLessThanOrEqualTo(Integer value) {
            addCriterion("salary_panel <=", value, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelIn(List<Integer> values) {
            addCriterion("salary_panel in", values, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelNotIn(List<Integer> values) {
            addCriterion("salary_panel not in", values, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelBetween(Integer value1, Integer value2) {
            addCriterion("salary_panel between", value1, value2, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSalaryPanelNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_panel not between", value1, value2, "salaryPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelIsNull() {
            addCriterion("sorted_files_panel is null");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelIsNotNull() {
            addCriterion("sorted_files_panel is not null");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelEqualTo(Integer value) {
            addCriterion("sorted_files_panel =", value, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelNotEqualTo(Integer value) {
            addCriterion("sorted_files_panel <>", value, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelGreaterThan(Integer value) {
            addCriterion("sorted_files_panel >", value, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelGreaterThanOrEqualTo(Integer value) {
            addCriterion("sorted_files_panel >=", value, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelLessThan(Integer value) {
            addCriterion("sorted_files_panel <", value, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelLessThanOrEqualTo(Integer value) {
            addCriterion("sorted_files_panel <=", value, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelIn(List<Integer> values) {
            addCriterion("sorted_files_panel in", values, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelNotIn(List<Integer> values) {
            addCriterion("sorted_files_panel not in", values, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelBetween(Integer value1, Integer value2) {
            addCriterion("sorted_files_panel between", value1, value2, "sortedFilesPanel");
            return (Criteria) this;
        }

        public Criteria andSortedFilesPanelNotBetween(Integer value1, Integer value2) {
            addCriterion("sorted_files_panel not between", value1, value2, "sortedFilesPanel");
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