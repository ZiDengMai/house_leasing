package leasing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Early_move_in_applyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Early_move_in_applyExample() {
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

        public Criteria andEarlyMoveInIdIsNull() {
            addCriterion("early_move_in_id is null");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdIsNotNull() {
            addCriterion("early_move_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdEqualTo(String value) {
            addCriterion("early_move_in_id =", value, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdNotEqualTo(String value) {
            addCriterion("early_move_in_id <>", value, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdGreaterThan(String value) {
            addCriterion("early_move_in_id >", value, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdGreaterThanOrEqualTo(String value) {
            addCriterion("early_move_in_id >=", value, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdLessThan(String value) {
            addCriterion("early_move_in_id <", value, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdLessThanOrEqualTo(String value) {
            addCriterion("early_move_in_id <=", value, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdLike(String value) {
            addCriterion("early_move_in_id like", value, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdNotLike(String value) {
            addCriterion("early_move_in_id not like", value, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdIn(List<String> values) {
            addCriterion("early_move_in_id in", values, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdNotIn(List<String> values) {
            addCriterion("early_move_in_id not in", values, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdBetween(String value1, String value2) {
            addCriterion("early_move_in_id between", value1, value2, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andEarlyMoveInIdNotBetween(String value1, String value2) {
            addCriterion("early_move_in_id not between", value1, value2, "earlyMoveInId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdIsNull() {
            addCriterion("leasing_id is null");
            return (Criteria) this;
        }

        public Criteria andLeasingIdIsNotNull() {
            addCriterion("leasing_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeasingIdEqualTo(String value) {
            addCriterion("leasing_id =", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdNotEqualTo(String value) {
            addCriterion("leasing_id <>", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdGreaterThan(String value) {
            addCriterion("leasing_id >", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdGreaterThanOrEqualTo(String value) {
            addCriterion("leasing_id >=", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdLessThan(String value) {
            addCriterion("leasing_id <", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdLessThanOrEqualTo(String value) {
            addCriterion("leasing_id <=", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdLike(String value) {
            addCriterion("leasing_id like", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdNotLike(String value) {
            addCriterion("leasing_id not like", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdIn(List<String> values) {
            addCriterion("leasing_id in", values, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdNotIn(List<String> values) {
            addCriterion("leasing_id not in", values, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdBetween(String value1, String value2) {
            addCriterion("leasing_id between", value1, value2, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdNotBetween(String value1, String value2) {
            addCriterion("leasing_id not between", value1, value2, "leasingId");
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

        public Criteria andTenantsNameIsNull() {
            addCriterion("tenants_name is null");
            return (Criteria) this;
        }

        public Criteria andTenantsNameIsNotNull() {
            addCriterion("tenants_name is not null");
            return (Criteria) this;
        }

        public Criteria andTenantsNameEqualTo(String value) {
            addCriterion("tenants_name =", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameNotEqualTo(String value) {
            addCriterion("tenants_name <>", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameGreaterThan(String value) {
            addCriterion("tenants_name >", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameGreaterThanOrEqualTo(String value) {
            addCriterion("tenants_name >=", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameLessThan(String value) {
            addCriterion("tenants_name <", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameLessThanOrEqualTo(String value) {
            addCriterion("tenants_name <=", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameLike(String value) {
            addCriterion("tenants_name like", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameNotLike(String value) {
            addCriterion("tenants_name not like", value, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameIn(List<String> values) {
            addCriterion("tenants_name in", values, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameNotIn(List<String> values) {
            addCriterion("tenants_name not in", values, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameBetween(String value1, String value2) {
            addCriterion("tenants_name between", value1, value2, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsNameNotBetween(String value1, String value2) {
            addCriterion("tenants_name not between", value1, value2, "tenantsName");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailIsNull() {
            addCriterion("tenants_email is null");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailIsNotNull() {
            addCriterion("tenants_email is not null");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailEqualTo(String value) {
            addCriterion("tenants_email =", value, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailNotEqualTo(String value) {
            addCriterion("tenants_email <>", value, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailGreaterThan(String value) {
            addCriterion("tenants_email >", value, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tenants_email >=", value, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailLessThan(String value) {
            addCriterion("tenants_email <", value, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailLessThanOrEqualTo(String value) {
            addCriterion("tenants_email <=", value, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailLike(String value) {
            addCriterion("tenants_email like", value, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailNotLike(String value) {
            addCriterion("tenants_email not like", value, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailIn(List<String> values) {
            addCriterion("tenants_email in", values, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailNotIn(List<String> values) {
            addCriterion("tenants_email not in", values, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailBetween(String value1, String value2) {
            addCriterion("tenants_email between", value1, value2, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andTenantsEmailNotBetween(String value1, String value2) {
            addCriterion("tenants_email not between", value1, value2, "tenantsEmail");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateIsNull() {
            addCriterion("expected_move_in_date is null");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateIsNotNull() {
            addCriterion("expected_move_in_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateEqualTo(Date value) {
            addCriterionForJDBCDate("expected_move_in_date =", value, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expected_move_in_date <>", value, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expected_move_in_date >", value, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expected_move_in_date >=", value, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateLessThan(Date value) {
            addCriterionForJDBCDate("expected_move_in_date <", value, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expected_move_in_date <=", value, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateIn(List<Date> values) {
            addCriterionForJDBCDate("expected_move_in_date in", values, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expected_move_in_date not in", values, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expected_move_in_date between", value1, value2, "expectedMoveInDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMoveInDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expected_move_in_date not between", value1, value2, "expectedMoveInDate");
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

        public Criteria andAssignRoomNumberIsNull() {
            addCriterion("assign_room_number is null");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberIsNotNull() {
            addCriterion("assign_room_number is not null");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberEqualTo(String value) {
            addCriterion("assign_room_number =", value, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberNotEqualTo(String value) {
            addCriterion("assign_room_number <>", value, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberGreaterThan(String value) {
            addCriterion("assign_room_number >", value, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("assign_room_number >=", value, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberLessThan(String value) {
            addCriterion("assign_room_number <", value, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberLessThanOrEqualTo(String value) {
            addCriterion("assign_room_number <=", value, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberLike(String value) {
            addCriterion("assign_room_number like", value, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberNotLike(String value) {
            addCriterion("assign_room_number not like", value, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberIn(List<String> values) {
            addCriterion("assign_room_number in", values, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberNotIn(List<String> values) {
            addCriterion("assign_room_number not in", values, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberBetween(String value1, String value2) {
            addCriterion("assign_room_number between", value1, value2, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andAssignRoomNumberNotBetween(String value1, String value2) {
            addCriterion("assign_room_number not between", value1, value2, "assignRoomNumber");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseIsNull() {
            addCriterion("the_same_room_as_lease is null");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseIsNotNull() {
            addCriterion("the_same_room_as_lease is not null");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseEqualTo(String value) {
            addCriterion("the_same_room_as_lease =", value, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseNotEqualTo(String value) {
            addCriterion("the_same_room_as_lease <>", value, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseGreaterThan(String value) {
            addCriterion("the_same_room_as_lease >", value, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseGreaterThanOrEqualTo(String value) {
            addCriterion("the_same_room_as_lease >=", value, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseLessThan(String value) {
            addCriterion("the_same_room_as_lease <", value, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseLessThanOrEqualTo(String value) {
            addCriterion("the_same_room_as_lease <=", value, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseLike(String value) {
            addCriterion("the_same_room_as_lease like", value, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseNotLike(String value) {
            addCriterion("the_same_room_as_lease not like", value, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseIn(List<String> values) {
            addCriterion("the_same_room_as_lease in", values, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseNotIn(List<String> values) {
            addCriterion("the_same_room_as_lease not in", values, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseBetween(String value1, String value2) {
            addCriterion("the_same_room_as_lease between", value1, value2, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andTheSameRoomAsLeaseNotBetween(String value1, String value2) {
            addCriterion("the_same_room_as_lease not between", value1, value2, "theSameRoomAsLease");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("submit_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("submit_date >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("submit_date <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("submit_date in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("submit_date not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submit_date between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submit_date not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("service_fee is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(Integer value) {
            addCriterion("service_fee =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(Integer value) {
            addCriterion("service_fee <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(Integer value) {
            addCriterion("service_fee >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_fee >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(Integer value) {
            addCriterion("service_fee <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(Integer value) {
            addCriterion("service_fee <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<Integer> values) {
            addCriterion("service_fee in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<Integer> values) {
            addCriterion("service_fee not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(Integer value1, Integer value2) {
            addCriterion("service_fee between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_fee not between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdIsNull() {
            addCriterion("specialist_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdIsNotNull() {
            addCriterion("specialist_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdEqualTo(String value) {
            addCriterion("specialist_id =", value, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdNotEqualTo(String value) {
            addCriterion("specialist_id <>", value, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdGreaterThan(String value) {
            addCriterion("specialist_id >", value, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdGreaterThanOrEqualTo(String value) {
            addCriterion("specialist_id >=", value, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdLessThan(String value) {
            addCriterion("specialist_id <", value, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdLessThanOrEqualTo(String value) {
            addCriterion("specialist_id <=", value, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdLike(String value) {
            addCriterion("specialist_id like", value, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdNotLike(String value) {
            addCriterion("specialist_id not like", value, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdIn(List<String> values) {
            addCriterion("specialist_id in", values, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdNotIn(List<String> values) {
            addCriterion("specialist_id not in", values, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdBetween(String value1, String value2) {
            addCriterion("specialist_id between", value1, value2, "specialistId");
            return (Criteria) this;
        }

        public Criteria andSpecialistIdNotBetween(String value1, String value2) {
            addCriterion("specialist_id not between", value1, value2, "specialistId");
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