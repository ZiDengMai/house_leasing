package leasing.entity;

import java.util.ArrayList;
import java.util.List;

public class Parking_spotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Parking_spotExample() {
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

        public Criteria andSpotNumberIsNull() {
            addCriterion("spot_number is null");
            return (Criteria) this;
        }

        public Criteria andSpotNumberIsNotNull() {
            addCriterion("spot_number is not null");
            return (Criteria) this;
        }

        public Criteria andSpotNumberEqualTo(Integer value) {
            addCriterion("spot_number =", value, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberNotEqualTo(Integer value) {
            addCriterion("spot_number <>", value, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberGreaterThan(Integer value) {
            addCriterion("spot_number >", value, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("spot_number >=", value, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberLessThan(Integer value) {
            addCriterion("spot_number <", value, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberLessThanOrEqualTo(Integer value) {
            addCriterion("spot_number <=", value, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberIn(List<Integer> values) {
            addCriterion("spot_number in", values, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberNotIn(List<Integer> values) {
            addCriterion("spot_number not in", values, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberBetween(Integer value1, Integer value2) {
            addCriterion("spot_number between", value1, value2, "spotNumber");
            return (Criteria) this;
        }

        public Criteria andSpotNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("spot_number not between", value1, value2, "spotNumber");
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

        public Criteria andLeasingIdEqualTo(Integer value) {
            addCriterion("leasing_id =", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdNotEqualTo(Integer value) {
            addCriterion("leasing_id <>", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdGreaterThan(Integer value) {
            addCriterion("leasing_id >", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leasing_id >=", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdLessThan(Integer value) {
            addCriterion("leasing_id <", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdLessThanOrEqualTo(Integer value) {
            addCriterion("leasing_id <=", value, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdIn(List<Integer> values) {
            addCriterion("leasing_id in", values, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdNotIn(List<Integer> values) {
            addCriterion("leasing_id not in", values, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdBetween(Integer value1, Integer value2) {
            addCriterion("leasing_id between", value1, value2, "leasingId");
            return (Criteria) this;
        }

        public Criteria andLeasingIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAvailableIsNull() {
            addCriterion("available is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("available is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(Integer value) {
            addCriterion("available =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(Integer value) {
            addCriterion("available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(Integer value) {
            addCriterion("available >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(Integer value) {
            addCriterion("available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(Integer value) {
            addCriterion("available <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(Integer value) {
            addCriterion("available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<Integer> values) {
            addCriterion("available in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<Integer> values) {
            addCriterion("available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(Integer value1, Integer value2) {
            addCriterion("available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(Integer value1, Integer value2) {
            addCriterion("available not between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andMakeIsNull() {
            addCriterion("make is null");
            return (Criteria) this;
        }

        public Criteria andMakeIsNotNull() {
            addCriterion("make is not null");
            return (Criteria) this;
        }

        public Criteria andMakeEqualTo(String value) {
            addCriterion("make =", value, "make");
            return (Criteria) this;
        }

        public Criteria andMakeNotEqualTo(String value) {
            addCriterion("make <>", value, "make");
            return (Criteria) this;
        }

        public Criteria andMakeGreaterThan(String value) {
            addCriterion("make >", value, "make");
            return (Criteria) this;
        }

        public Criteria andMakeGreaterThanOrEqualTo(String value) {
            addCriterion("make >=", value, "make");
            return (Criteria) this;
        }

        public Criteria andMakeLessThan(String value) {
            addCriterion("make <", value, "make");
            return (Criteria) this;
        }

        public Criteria andMakeLessThanOrEqualTo(String value) {
            addCriterion("make <=", value, "make");
            return (Criteria) this;
        }

        public Criteria andMakeLike(String value) {
            addCriterion("make like", value, "make");
            return (Criteria) this;
        }

        public Criteria andMakeNotLike(String value) {
            addCriterion("make not like", value, "make");
            return (Criteria) this;
        }

        public Criteria andMakeIn(List<String> values) {
            addCriterion("make in", values, "make");
            return (Criteria) this;
        }

        public Criteria andMakeNotIn(List<String> values) {
            addCriterion("make not in", values, "make");
            return (Criteria) this;
        }

        public Criteria andMakeBetween(String value1, String value2) {
            addCriterion("make between", value1, value2, "make");
            return (Criteria) this;
        }

        public Criteria andMakeNotBetween(String value1, String value2) {
            addCriterion("make not between", value1, value2, "make");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolIsNull() {
            addCriterion("parking_spotcol is null");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolIsNotNull() {
            addCriterion("parking_spotcol is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolEqualTo(String value) {
            addCriterion("parking_spotcol =", value, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolNotEqualTo(String value) {
            addCriterion("parking_spotcol <>", value, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolGreaterThan(String value) {
            addCriterion("parking_spotcol >", value, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolGreaterThanOrEqualTo(String value) {
            addCriterion("parking_spotcol >=", value, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolLessThan(String value) {
            addCriterion("parking_spotcol <", value, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolLessThanOrEqualTo(String value) {
            addCriterion("parking_spotcol <=", value, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolLike(String value) {
            addCriterion("parking_spotcol like", value, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolNotLike(String value) {
            addCriterion("parking_spotcol not like", value, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolIn(List<String> values) {
            addCriterion("parking_spotcol in", values, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolNotIn(List<String> values) {
            addCriterion("parking_spotcol not in", values, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolBetween(String value1, String value2) {
            addCriterion("parking_spotcol between", value1, value2, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andParkingSpotcolNotBetween(String value1, String value2) {
            addCriterion("parking_spotcol not between", value1, value2, "parkingSpotcol");
            return (Criteria) this;
        }

        public Criteria andBodyTypeIsNull() {
            addCriterion("body_type is null");
            return (Criteria) this;
        }

        public Criteria andBodyTypeIsNotNull() {
            addCriterion("body_type is not null");
            return (Criteria) this;
        }

        public Criteria andBodyTypeEqualTo(String value) {
            addCriterion("body_type =", value, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeNotEqualTo(String value) {
            addCriterion("body_type <>", value, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeGreaterThan(String value) {
            addCriterion("body_type >", value, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("body_type >=", value, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeLessThan(String value) {
            addCriterion("body_type <", value, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeLessThanOrEqualTo(String value) {
            addCriterion("body_type <=", value, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeLike(String value) {
            addCriterion("body_type like", value, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeNotLike(String value) {
            addCriterion("body_type not like", value, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeIn(List<String> values) {
            addCriterion("body_type in", values, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeNotIn(List<String> values) {
            addCriterion("body_type not in", values, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeBetween(String value1, String value2) {
            addCriterion("body_type between", value1, value2, "bodyType");
            return (Criteria) this;
        }

        public Criteria andBodyTypeNotBetween(String value1, String value2) {
            addCriterion("body_type not between", value1, value2, "bodyType");
            return (Criteria) this;
        }

        public Criteria andNodeIsNull() {
            addCriterion("node is null");
            return (Criteria) this;
        }

        public Criteria andNodeIsNotNull() {
            addCriterion("node is not null");
            return (Criteria) this;
        }

        public Criteria andNodeEqualTo(String value) {
            addCriterion("node =", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotEqualTo(String value) {
            addCriterion("node <>", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThan(String value) {
            addCriterion("node >", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThanOrEqualTo(String value) {
            addCriterion("node >=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThan(String value) {
            addCriterion("node <", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThanOrEqualTo(String value) {
            addCriterion("node <=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLike(String value) {
            addCriterion("node like", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotLike(String value) {
            addCriterion("node not like", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeIn(List<String> values) {
            addCriterion("node in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotIn(List<String> values) {
            addCriterion("node not in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeBetween(String value1, String value2) {
            addCriterion("node between", value1, value2, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotBetween(String value1, String value2) {
            addCriterion("node not between", value1, value2, "node");
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