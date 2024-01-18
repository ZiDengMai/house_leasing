package leasing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryExample() {
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

        public Criteria andHistoryIdIsNull() {
            addCriterion("history_id is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIsNotNull() {
            addCriterion("history_id is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdEqualTo(String value) {
            addCriterion("history_id =", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotEqualTo(String value) {
            addCriterion("history_id <>", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThan(String value) {
            addCriterion("history_id >", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("history_id >=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThan(String value) {
            addCriterion("history_id <", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThanOrEqualTo(String value) {
            addCriterion("history_id <=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLike(String value) {
            addCriterion("history_id like", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotLike(String value) {
            addCriterion("history_id not like", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIn(List<String> values) {
            addCriterion("history_id in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotIn(List<String> values) {
            addCriterion("history_id not in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdBetween(String value1, String value2) {
            addCriterion("history_id between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotBetween(String value1, String value2) {
            addCriterion("history_id not between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIsNull() {
            addCriterion("property_id is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIsNotNull() {
            addCriterion("property_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdEqualTo(String value) {
            addCriterion("property_id =", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotEqualTo(String value) {
            addCriterion("property_id <>", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdGreaterThan(String value) {
            addCriterion("property_id >", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdGreaterThanOrEqualTo(String value) {
            addCriterion("property_id >=", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLessThan(String value) {
            addCriterion("property_id <", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLessThanOrEqualTo(String value) {
            addCriterion("property_id <=", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLike(String value) {
            addCriterion("property_id like", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotLike(String value) {
            addCriterion("property_id not like", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIn(List<String> values) {
            addCriterion("property_id in", values, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotIn(List<String> values) {
            addCriterion("property_id not in", values, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdBetween(String value1, String value2) {
            addCriterion("property_id between", value1, value2, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotBetween(String value1, String value2) {
            addCriterion("property_id not between", value1, value2, "propertyId");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsIsNull() {
            addCriterion("total_rooms is null");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsIsNotNull() {
            addCriterion("total_rooms is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsEqualTo(Integer value) {
            addCriterion("total_rooms =", value, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsNotEqualTo(Integer value) {
            addCriterion("total_rooms <>", value, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsGreaterThan(Integer value) {
            addCriterion("total_rooms >", value, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_rooms >=", value, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsLessThan(Integer value) {
            addCriterion("total_rooms <", value, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsLessThanOrEqualTo(Integer value) {
            addCriterion("total_rooms <=", value, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsIn(List<Integer> values) {
            addCriterion("total_rooms in", values, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsNotIn(List<Integer> values) {
            addCriterion("total_rooms not in", values, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsBetween(Integer value1, Integer value2) {
            addCriterion("total_rooms between", value1, value2, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andTotalRoomsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_rooms not between", value1, value2, "totalRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsIsNull() {
            addCriterion("signed_or_reserved_rooms is null");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsIsNotNull() {
            addCriterion("signed_or_reserved_rooms is not null");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsEqualTo(Integer value) {
            addCriterion("signed_or_reserved_rooms =", value, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsNotEqualTo(Integer value) {
            addCriterion("signed_or_reserved_rooms <>", value, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsGreaterThan(Integer value) {
            addCriterion("signed_or_reserved_rooms >", value, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsGreaterThanOrEqualTo(Integer value) {
            addCriterion("signed_or_reserved_rooms >=", value, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsLessThan(Integer value) {
            addCriterion("signed_or_reserved_rooms <", value, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsLessThanOrEqualTo(Integer value) {
            addCriterion("signed_or_reserved_rooms <=", value, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsIn(List<Integer> values) {
            addCriterion("signed_or_reserved_rooms in", values, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsNotIn(List<Integer> values) {
            addCriterion("signed_or_reserved_rooms not in", values, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsBetween(Integer value1, Integer value2) {
            addCriterion("signed_or_reserved_rooms between", value1, value2, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andSignedOrReservedRoomsNotBetween(Integer value1, Integer value2) {
            addCriterion("signed_or_reserved_rooms not between", value1, value2, "signedOrReservedRooms");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIsNull() {
            addCriterion("complete_rate is null");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIsNotNull() {
            addCriterion("complete_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteRateEqualTo(Double value) {
            addCriterion("complete_rate =", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotEqualTo(Double value) {
            addCriterion("complete_rate <>", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateGreaterThan(Double value) {
            addCriterion("complete_rate >", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateGreaterThanOrEqualTo(Double value) {
            addCriterion("complete_rate >=", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateLessThan(Double value) {
            addCriterion("complete_rate <", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateLessThanOrEqualTo(Double value) {
            addCriterion("complete_rate <=", value, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateIn(List<Double> values) {
            addCriterion("complete_rate in", values, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotIn(List<Double> values) {
            addCriterion("complete_rate not in", values, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateBetween(Double value1, Double value2) {
            addCriterion("complete_rate between", value1, value2, "completeRate");
            return (Criteria) this;
        }

        public Criteria andCompleteRateNotBetween(Double value1, Double value2) {
            addCriterion("complete_rate not between", value1, value2, "completeRate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateIsNull() {
            addCriterion("rooms_has_candidate is null");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateIsNotNull() {
            addCriterion("rooms_has_candidate is not null");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateEqualTo(String value) {
            addCriterion("rooms_has_candidate =", value, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateNotEqualTo(String value) {
            addCriterion("rooms_has_candidate <>", value, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateGreaterThan(String value) {
            addCriterion("rooms_has_candidate >", value, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateGreaterThanOrEqualTo(String value) {
            addCriterion("rooms_has_candidate >=", value, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateLessThan(String value) {
            addCriterion("rooms_has_candidate <", value, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateLessThanOrEqualTo(String value) {
            addCriterion("rooms_has_candidate <=", value, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateLike(String value) {
            addCriterion("rooms_has_candidate like", value, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateNotLike(String value) {
            addCriterion("rooms_has_candidate not like", value, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateIn(List<String> values) {
            addCriterion("rooms_has_candidate in", values, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateNotIn(List<String> values) {
            addCriterion("rooms_has_candidate not in", values, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateBetween(String value1, String value2) {
            addCriterion("rooms_has_candidate between", value1, value2, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandidateNotBetween(String value1, String value2) {
            addCriterion("rooms_has_candidate not between", value1, value2, "roomsHasCandidate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateIsNull() {
            addCriterion("maximum_rent_rate is null");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateIsNotNull() {
            addCriterion("maximum_rent_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateEqualTo(Double value) {
            addCriterion("maximum_rent_rate =", value, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateNotEqualTo(Double value) {
            addCriterion("maximum_rent_rate <>", value, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateGreaterThan(Double value) {
            addCriterion("maximum_rent_rate >", value, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateGreaterThanOrEqualTo(Double value) {
            addCriterion("maximum_rent_rate >=", value, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateLessThan(Double value) {
            addCriterion("maximum_rent_rate <", value, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateLessThanOrEqualTo(Double value) {
            addCriterion("maximum_rent_rate <=", value, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateIn(List<Double> values) {
            addCriterion("maximum_rent_rate in", values, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateNotIn(List<Double> values) {
            addCriterion("maximum_rent_rate not in", values, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateBetween(Double value1, Double value2) {
            addCriterion("maximum_rent_rate between", value1, value2, "maximumRentRate");
            return (Criteria) this;
        }

        public Criteria andMaximumRentRateNotBetween(Double value1, Double value2) {
            addCriterion("maximum_rent_rate not between", value1, value2, "maximumRentRate");
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