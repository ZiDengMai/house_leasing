package leasing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TourExample() {
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

        public Criteria andTourIdIsNull() {
            addCriterion("tour_id is null");
            return (Criteria) this;
        }

        public Criteria andTourIdIsNotNull() {
            addCriterion("tour_id is not null");
            return (Criteria) this;
        }

        public Criteria andTourIdEqualTo(String value) {
            addCriterion("tour_id =", value, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdNotEqualTo(String value) {
            addCriterion("tour_id <>", value, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdGreaterThan(String value) {
            addCriterion("tour_id >", value, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdGreaterThanOrEqualTo(String value) {
            addCriterion("tour_id >=", value, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdLessThan(String value) {
            addCriterion("tour_id <", value, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdLessThanOrEqualTo(String value) {
            addCriterion("tour_id <=", value, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdLike(String value) {
            addCriterion("tour_id like", value, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdNotLike(String value) {
            addCriterion("tour_id not like", value, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdIn(List<String> values) {
            addCriterion("tour_id in", values, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdNotIn(List<String> values) {
            addCriterion("tour_id not in", values, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdBetween(String value1, String value2) {
            addCriterion("tour_id between", value1, value2, "tourId");
            return (Criteria) this;
        }

        public Criteria andTourIdNotBetween(String value1, String value2) {
            addCriterion("tour_id not between", value1, value2, "tourId");
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

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andUnitId1IsNull() {
            addCriterion("unit_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andUnitId1IsNotNull() {
            addCriterion("unit_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitId1EqualTo(String value) {
            addCriterion("unit_id_1 =", value, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1NotEqualTo(String value) {
            addCriterion("unit_id_1 <>", value, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1GreaterThan(String value) {
            addCriterion("unit_id_1 >", value, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1GreaterThanOrEqualTo(String value) {
            addCriterion("unit_id_1 >=", value, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1LessThan(String value) {
            addCriterion("unit_id_1 <", value, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1LessThanOrEqualTo(String value) {
            addCriterion("unit_id_1 <=", value, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1Like(String value) {
            addCriterion("unit_id_1 like", value, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1NotLike(String value) {
            addCriterion("unit_id_1 not like", value, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1In(List<String> values) {
            addCriterion("unit_id_1 in", values, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1NotIn(List<String> values) {
            addCriterion("unit_id_1 not in", values, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1Between(String value1, String value2) {
            addCriterion("unit_id_1 between", value1, value2, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId1NotBetween(String value1, String value2) {
            addCriterion("unit_id_1 not between", value1, value2, "unitId1");
            return (Criteria) this;
        }

        public Criteria andUnitId2IsNull() {
            addCriterion("unit_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andUnitId2IsNotNull() {
            addCriterion("unit_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitId2EqualTo(String value) {
            addCriterion("unit_id_2 =", value, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2NotEqualTo(String value) {
            addCriterion("unit_id_2 <>", value, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2GreaterThan(String value) {
            addCriterion("unit_id_2 >", value, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2GreaterThanOrEqualTo(String value) {
            addCriterion("unit_id_2 >=", value, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2LessThan(String value) {
            addCriterion("unit_id_2 <", value, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2LessThanOrEqualTo(String value) {
            addCriterion("unit_id_2 <=", value, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2Like(String value) {
            addCriterion("unit_id_2 like", value, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2NotLike(String value) {
            addCriterion("unit_id_2 not like", value, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2In(List<String> values) {
            addCriterion("unit_id_2 in", values, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2NotIn(List<String> values) {
            addCriterion("unit_id_2 not in", values, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2Between(String value1, String value2) {
            addCriterion("unit_id_2 between", value1, value2, "unitId2");
            return (Criteria) this;
        }

        public Criteria andUnitId2NotBetween(String value1, String value2) {
            addCriterion("unit_id_2 not between", value1, value2, "unitId2");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("`time` not between", value1, value2, "time");
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

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("reviewer is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("reviewer =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("reviewer <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("reviewer >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("reviewer <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("reviewer <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("reviewer like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("reviewer not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("reviewer in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("reviewer not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("reviewer not between", value1, value2, "reviewer");
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