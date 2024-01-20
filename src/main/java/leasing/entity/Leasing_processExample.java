package leasing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Leasing_processExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Leasing_processExample() {
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

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("process_id like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("process_id not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
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

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLableIsNull() {
            addCriterion("lable is null");
            return (Criteria) this;
        }

        public Criteria andLableIsNotNull() {
            addCriterion("lable is not null");
            return (Criteria) this;
        }

        public Criteria andLableEqualTo(String value) {
            addCriterion("lable =", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotEqualTo(String value) {
            addCriterion("lable <>", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableGreaterThan(String value) {
            addCriterion("lable >", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableGreaterThanOrEqualTo(String value) {
            addCriterion("lable >=", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableLessThan(String value) {
            addCriterion("lable <", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableLessThanOrEqualTo(String value) {
            addCriterion("lable <=", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableLike(String value) {
            addCriterion("lable like", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotLike(String value) {
            addCriterion("lable not like", value, "lable");
            return (Criteria) this;
        }

        public Criteria andLableIn(List<String> values) {
            addCriterion("lable in", values, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotIn(List<String> values) {
            addCriterion("lable not in", values, "lable");
            return (Criteria) this;
        }

        public Criteria andLableBetween(String value1, String value2) {
            addCriterion("lable between", value1, value2, "lable");
            return (Criteria) this;
        }

        public Criteria andLableNotBetween(String value1, String value2) {
            addCriterion("lable not between", value1, value2, "lable");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityIsNull() {
            addCriterion("is_top_priority is null");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityIsNotNull() {
            addCriterion("is_top_priority is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityEqualTo(Integer value) {
            addCriterion("is_top_priority =", value, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityNotEqualTo(Integer value) {
            addCriterion("is_top_priority <>", value, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityGreaterThan(Integer value) {
            addCriterion("is_top_priority >", value, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_top_priority >=", value, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityLessThan(Integer value) {
            addCriterion("is_top_priority <", value, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("is_top_priority <=", value, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityIn(List<Integer> values) {
            addCriterion("is_top_priority in", values, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityNotIn(List<Integer> values) {
            addCriterion("is_top_priority not in", values, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityBetween(Integer value1, Integer value2) {
            addCriterion("is_top_priority between", value1, value2, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andIsTopPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("is_top_priority not between", value1, value2, "isTopPriority");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoIsNull() {
            addCriterion("leasing_info is null");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoIsNotNull() {
            addCriterion("leasing_info is not null");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoEqualTo(String value) {
            addCriterion("leasing_info =", value, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoNotEqualTo(String value) {
            addCriterion("leasing_info <>", value, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoGreaterThan(String value) {
            addCriterion("leasing_info >", value, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoGreaterThanOrEqualTo(String value) {
            addCriterion("leasing_info >=", value, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoLessThan(String value) {
            addCriterion("leasing_info <", value, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoLessThanOrEqualTo(String value) {
            addCriterion("leasing_info <=", value, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoLike(String value) {
            addCriterion("leasing_info like", value, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoNotLike(String value) {
            addCriterion("leasing_info not like", value, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoIn(List<String> values) {
            addCriterion("leasing_info in", values, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoNotIn(List<String> values) {
            addCriterion("leasing_info not in", values, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoBetween(String value1, String value2) {
            addCriterion("leasing_info between", value1, value2, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andLeasingInfoNotBetween(String value1, String value2) {
            addCriterion("leasing_info not between", value1, value2, "leasingInfo");
            return (Criteria) this;
        }

        public Criteria andMoveInDateIsNull() {
            addCriterion("move_in_date is null");
            return (Criteria) this;
        }

        public Criteria andMoveInDateIsNotNull() {
            addCriterion("move_in_date is not null");
            return (Criteria) this;
        }

        public Criteria andMoveInDateEqualTo(Date value) {
            addCriterionForJDBCDate("move_in_date =", value, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("move_in_date <>", value, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateGreaterThan(Date value) {
            addCriterionForJDBCDate("move_in_date >", value, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("move_in_date >=", value, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateLessThan(Date value) {
            addCriterionForJDBCDate("move_in_date <", value, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("move_in_date <=", value, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateIn(List<Date> values) {
            addCriterionForJDBCDate("move_in_date in", values, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("move_in_date not in", values, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("move_in_date between", value1, value2, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveInDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("move_in_date not between", value1, value2, "moveInDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateIsNull() {
            addCriterion("move_out_date is null");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateIsNotNull() {
            addCriterion("move_out_date is not null");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateEqualTo(Date value) {
            addCriterionForJDBCDate("move_out_date =", value, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("move_out_date <>", value, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("move_out_date >", value, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("move_out_date >=", value, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateLessThan(Date value) {
            addCriterionForJDBCDate("move_out_date <", value, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("move_out_date <=", value, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateIn(List<Date> values) {
            addCriterionForJDBCDate("move_out_date in", values, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("move_out_date not in", values, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("move_out_date between", value1, value2, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andMoveOutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("move_out_date not between", value1, value2, "moveOutDate");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceIsNull() {
            addCriterion("leasing_price is null");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceIsNotNull() {
            addCriterion("leasing_price is not null");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceEqualTo(Integer value) {
            addCriterion("leasing_price =", value, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceNotEqualTo(Integer value) {
            addCriterion("leasing_price <>", value, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceGreaterThan(Integer value) {
            addCriterion("leasing_price >", value, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("leasing_price >=", value, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceLessThan(Integer value) {
            addCriterion("leasing_price <", value, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceLessThanOrEqualTo(Integer value) {
            addCriterion("leasing_price <=", value, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceIn(List<Integer> values) {
            addCriterion("leasing_price in", values, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceNotIn(List<Integer> values) {
            addCriterion("leasing_price not in", values, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceBetween(Integer value1, Integer value2) {
            addCriterion("leasing_price between", value1, value2, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andLeasingPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("leasing_price not between", value1, value2, "leasingPrice");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNull() {
            addCriterion("deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(Integer value) {
            addCriterion("deposit_amount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(Integer value) {
            addCriterion("deposit_amount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(Integer value) {
            addCriterion("deposit_amount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_amount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(Integer value) {
            addCriterion("deposit_amount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_amount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<Integer> values) {
            addCriterion("deposit_amount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<Integer> values) {
            addCriterion("deposit_amount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(Integer value1, Integer value2) {
            addCriterion("deposit_amount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_amount not between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionIsNull() {
            addCriterion("negotiate_comission is null");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionIsNotNull() {
            addCriterion("negotiate_comission is not null");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionEqualTo(Double value) {
            addCriterion("negotiate_comission =", value, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionNotEqualTo(Double value) {
            addCriterion("negotiate_comission <>", value, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionGreaterThan(Double value) {
            addCriterion("negotiate_comission >", value, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionGreaterThanOrEqualTo(Double value) {
            addCriterion("negotiate_comission >=", value, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionLessThan(Double value) {
            addCriterion("negotiate_comission <", value, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionLessThanOrEqualTo(Double value) {
            addCriterion("negotiate_comission <=", value, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionIn(List<Double> values) {
            addCriterion("negotiate_comission in", values, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionNotIn(List<Double> values) {
            addCriterion("negotiate_comission not in", values, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionBetween(Double value1, Double value2) {
            addCriterion("negotiate_comission between", value1, value2, "negotiateComission");
            return (Criteria) this;
        }

        public Criteria andNegotiateComissionNotBetween(Double value1, Double value2) {
            addCriterion("negotiate_comission not between", value1, value2, "negotiateComission");
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

        public Criteria andApplicationPageIsNull() {
            addCriterion("application_page is null");
            return (Criteria) this;
        }

        public Criteria andApplicationPageIsNotNull() {
            addCriterion("application_page is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationPageEqualTo(String value) {
            addCriterion("application_page =", value, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageNotEqualTo(String value) {
            addCriterion("application_page <>", value, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageGreaterThan(String value) {
            addCriterion("application_page >", value, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageGreaterThanOrEqualTo(String value) {
            addCriterion("application_page >=", value, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageLessThan(String value) {
            addCriterion("application_page <", value, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageLessThanOrEqualTo(String value) {
            addCriterion("application_page <=", value, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageLike(String value) {
            addCriterion("application_page like", value, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageNotLike(String value) {
            addCriterion("application_page not like", value, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageIn(List<String> values) {
            addCriterion("application_page in", values, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageNotIn(List<String> values) {
            addCriterion("application_page not in", values, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageBetween(String value1, String value2) {
            addCriterion("application_page between", value1, value2, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationPageNotBetween(String value1, String value2) {
            addCriterion("application_page not between", value1, value2, "applicationPage");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNull() {
            addCriterion("application_status is null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNotNull() {
            addCriterion("application_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusEqualTo(String value) {
            addCriterion("application_status =", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotEqualTo(String value) {
            addCriterion("application_status <>", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThan(String value) {
            addCriterion("application_status >", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("application_status >=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThan(String value) {
            addCriterion("application_status <", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThanOrEqualTo(String value) {
            addCriterion("application_status <=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLike(String value) {
            addCriterion("application_status like", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotLike(String value) {
            addCriterion("application_status not like", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIn(List<String> values) {
            addCriterion("application_status in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotIn(List<String> values) {
            addCriterion("application_status not in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusBetween(String value1, String value2) {
            addCriterion("application_status between", value1, value2, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotBetween(String value1, String value2) {
            addCriterion("application_status not between", value1, value2, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateIsNull() {
            addCriterion("apply_submit_date is null");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateIsNotNull() {
            addCriterion("apply_submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("apply_submit_date =", value, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("apply_submit_date <>", value, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("apply_submit_date >", value, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_submit_date >=", value, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("apply_submit_date <", value, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_submit_date <=", value, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("apply_submit_date in", values, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("apply_submit_date not in", values, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_submit_date between", value1, value2, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andApplySubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_submit_date not between", value1, value2, "applySubmitDate");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaIsNull() {
            addCriterion("id_or_visa is null");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaIsNotNull() {
            addCriterion("id_or_visa is not null");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaEqualTo(Integer value) {
            addCriterion("id_or_visa =", value, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaNotEqualTo(Integer value) {
            addCriterion("id_or_visa <>", value, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaGreaterThan(Integer value) {
            addCriterion("id_or_visa >", value, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_or_visa >=", value, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaLessThan(Integer value) {
            addCriterion("id_or_visa <", value, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaLessThanOrEqualTo(Integer value) {
            addCriterion("id_or_visa <=", value, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaIn(List<Integer> values) {
            addCriterion("id_or_visa in", values, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaNotIn(List<Integer> values) {
            addCriterion("id_or_visa not in", values, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaBetween(Integer value1, Integer value2) {
            addCriterion("id_or_visa between", value1, value2, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andIdOrVisaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_or_visa not between", value1, value2, "idOrVisa");
            return (Criteria) this;
        }

        public Criteria andI20IsNull() {
            addCriterion("i20 is null");
            return (Criteria) this;
        }

        public Criteria andI20IsNotNull() {
            addCriterion("i20 is not null");
            return (Criteria) this;
        }

        public Criteria andI20EqualTo(String value) {
            addCriterion("i20 =", value, "i20");
            return (Criteria) this;
        }

        public Criteria andI20NotEqualTo(String value) {
            addCriterion("i20 <>", value, "i20");
            return (Criteria) this;
        }

        public Criteria andI20GreaterThan(String value) {
            addCriterion("i20 >", value, "i20");
            return (Criteria) this;
        }

        public Criteria andI20GreaterThanOrEqualTo(String value) {
            addCriterion("i20 >=", value, "i20");
            return (Criteria) this;
        }

        public Criteria andI20LessThan(String value) {
            addCriterion("i20 <", value, "i20");
            return (Criteria) this;
        }

        public Criteria andI20LessThanOrEqualTo(String value) {
            addCriterion("i20 <=", value, "i20");
            return (Criteria) this;
        }

        public Criteria andI20Like(String value) {
            addCriterion("i20 like", value, "i20");
            return (Criteria) this;
        }

        public Criteria andI20NotLike(String value) {
            addCriterion("i20 not like", value, "i20");
            return (Criteria) this;
        }

        public Criteria andI20In(List<String> values) {
            addCriterion("i20 in", values, "i20");
            return (Criteria) this;
        }

        public Criteria andI20NotIn(List<String> values) {
            addCriterion("i20 not in", values, "i20");
            return (Criteria) this;
        }

        public Criteria andI20Between(String value1, String value2) {
            addCriterion("i20 between", value1, value2, "i20");
            return (Criteria) this;
        }

        public Criteria andI20NotBetween(String value1, String value2) {
            addCriterion("i20 not between", value1, value2, "i20");
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

        public Criteria andApplicationFeeIsNull() {
            addCriterion("application_fee is null");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeIsNotNull() {
            addCriterion("application_fee is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeEqualTo(Integer value) {
            addCriterion("application_fee =", value, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeNotEqualTo(Integer value) {
            addCriterion("application_fee <>", value, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeGreaterThan(Integer value) {
            addCriterion("application_fee >", value, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_fee >=", value, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeLessThan(Integer value) {
            addCriterion("application_fee <", value, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeLessThanOrEqualTo(Integer value) {
            addCriterion("application_fee <=", value, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeIn(List<Integer> values) {
            addCriterion("application_fee in", values, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeNotIn(List<Integer> values) {
            addCriterion("application_fee not in", values, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeBetween(Integer value1, Integer value2) {
            addCriterion("application_fee between", value1, value2, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andApplicationFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("application_fee not between", value1, value2, "applicationFee");
            return (Criteria) this;
        }

        public Criteria andFinalPageIsNull() {
            addCriterion("final_page is null");
            return (Criteria) this;
        }

        public Criteria andFinalPageIsNotNull() {
            addCriterion("final_page is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPageEqualTo(String value) {
            addCriterion("final_page =", value, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageNotEqualTo(String value) {
            addCriterion("final_page <>", value, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageGreaterThan(String value) {
            addCriterion("final_page >", value, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageGreaterThanOrEqualTo(String value) {
            addCriterion("final_page >=", value, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageLessThan(String value) {
            addCriterion("final_page <", value, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageLessThanOrEqualTo(String value) {
            addCriterion("final_page <=", value, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageLike(String value) {
            addCriterion("final_page like", value, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageNotLike(String value) {
            addCriterion("final_page not like", value, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageIn(List<String> values) {
            addCriterion("final_page in", values, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageNotIn(List<String> values) {
            addCriterion("final_page not in", values, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageBetween(String value1, String value2) {
            addCriterion("final_page between", value1, value2, "finalPage");
            return (Criteria) this;
        }

        public Criteria andFinalPageNotBetween(String value1, String value2) {
            addCriterion("final_page not between", value1, value2, "finalPage");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusIsNull() {
            addCriterion("lease_status is null");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusIsNotNull() {
            addCriterion("lease_status is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusEqualTo(String value) {
            addCriterion("lease_status =", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusNotEqualTo(String value) {
            addCriterion("lease_status <>", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusGreaterThan(String value) {
            addCriterion("lease_status >", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("lease_status >=", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusLessThan(String value) {
            addCriterion("lease_status <", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusLessThanOrEqualTo(String value) {
            addCriterion("lease_status <=", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusLike(String value) {
            addCriterion("lease_status like", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusNotLike(String value) {
            addCriterion("lease_status not like", value, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusIn(List<String> values) {
            addCriterion("lease_status in", values, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusNotIn(List<String> values) {
            addCriterion("lease_status not in", values, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusBetween(String value1, String value2) {
            addCriterion("lease_status between", value1, value2, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseStatusNotBetween(String value1, String value2) {
            addCriterion("lease_status not between", value1, value2, "leaseStatus");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateIsNull() {
            addCriterion("lease_comfirm_date is null");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateIsNotNull() {
            addCriterion("lease_comfirm_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateEqualTo(Date value) {
            addCriterionForJDBCDate("lease_comfirm_date =", value, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lease_comfirm_date <>", value, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateGreaterThan(Date value) {
            addCriterionForJDBCDate("lease_comfirm_date >", value, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lease_comfirm_date >=", value, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateLessThan(Date value) {
            addCriterionForJDBCDate("lease_comfirm_date <", value, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lease_comfirm_date <=", value, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateIn(List<Date> values) {
            addCriterionForJDBCDate("lease_comfirm_date in", values, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lease_comfirm_date not in", values, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lease_comfirm_date between", value1, value2, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andLeaseComfirmDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lease_comfirm_date not between", value1, value2, "leaseComfirmDate");
            return (Criteria) this;
        }

        public Criteria andContractIsNull() {
            addCriterion("contract is null");
            return (Criteria) this;
        }

        public Criteria andContractIsNotNull() {
            addCriterion("contract is not null");
            return (Criteria) this;
        }

        public Criteria andContractEqualTo(String value) {
            addCriterion("contract =", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotEqualTo(String value) {
            addCriterion("contract <>", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThan(String value) {
            addCriterion("contract >", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThanOrEqualTo(String value) {
            addCriterion("contract >=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThan(String value) {
            addCriterion("contract <", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThanOrEqualTo(String value) {
            addCriterion("contract <=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLike(String value) {
            addCriterion("contract like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotLike(String value) {
            addCriterion("contract not like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractIn(List<String> values) {
            addCriterion("contract in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotIn(List<String> values) {
            addCriterion("contract not in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractBetween(String value1, String value2) {
            addCriterion("contract between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotBetween(String value1, String value2) {
            addCriterion("contract not between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andDepositFeeIsNull() {
            addCriterion("deposit_fee is null");
            return (Criteria) this;
        }

        public Criteria andDepositFeeIsNotNull() {
            addCriterion("deposit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDepositFeeEqualTo(Integer value) {
            addCriterion("deposit_fee =", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeNotEqualTo(Integer value) {
            addCriterion("deposit_fee <>", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeGreaterThan(Integer value) {
            addCriterion("deposit_fee >", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_fee >=", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeLessThan(Integer value) {
            addCriterion("deposit_fee <", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_fee <=", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeIn(List<Integer> values) {
            addCriterion("deposit_fee in", values, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeNotIn(List<Integer> values) {
            addCriterion("deposit_fee not in", values, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeBetween(Integer value1, Integer value2) {
            addCriterion("deposit_fee between", value1, value2, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_fee not between", value1, value2, "depositFee");
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