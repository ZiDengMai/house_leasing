package leasing.entity;

import java.util.ArrayList;
import java.util.List;

public class PropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyExample() {
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

        public Criteria andPropetyIdIsNull() {
            addCriterion("propety_id is null");
            return (Criteria) this;
        }

        public Criteria andPropetyIdIsNotNull() {
            addCriterion("propety_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropetyIdEqualTo(String value) {
            addCriterion("propety_id =", value, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdNotEqualTo(String value) {
            addCriterion("propety_id <>", value, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdGreaterThan(String value) {
            addCriterion("propety_id >", value, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdGreaterThanOrEqualTo(String value) {
            addCriterion("propety_id >=", value, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdLessThan(String value) {
            addCriterion("propety_id <", value, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdLessThanOrEqualTo(String value) {
            addCriterion("propety_id <=", value, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdLike(String value) {
            addCriterion("propety_id like", value, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdNotLike(String value) {
            addCriterion("propety_id not like", value, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdIn(List<String> values) {
            addCriterion("propety_id in", values, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdNotIn(List<String> values) {
            addCriterion("propety_id not in", values, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdBetween(String value1, String value2) {
            addCriterion("propety_id between", value1, value2, "propetyId");
            return (Criteria) this;
        }

        public Criteria andPropetyIdNotBetween(String value1, String value2) {
            addCriterion("propety_id not between", value1, value2, "propetyId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andSignOrLeaseIsNull() {
            addCriterion("sign_or_lease is null");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseIsNotNull() {
            addCriterion("sign_or_lease is not null");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseEqualTo(Integer value) {
            addCriterion("sign_or_lease =", value, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseNotEqualTo(Integer value) {
            addCriterion("sign_or_lease <>", value, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseGreaterThan(Integer value) {
            addCriterion("sign_or_lease >", value, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_or_lease >=", value, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseLessThan(Integer value) {
            addCriterion("sign_or_lease <", value, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseLessThanOrEqualTo(Integer value) {
            addCriterion("sign_or_lease <=", value, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseIn(List<Integer> values) {
            addCriterion("sign_or_lease in", values, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseNotIn(List<Integer> values) {
            addCriterion("sign_or_lease not in", values, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseBetween(Integer value1, Integer value2) {
            addCriterion("sign_or_lease between", value1, value2, "signOrLease");
            return (Criteria) this;
        }

        public Criteria andSignOrLeaseNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_or_lease not between", value1, value2, "signOrLease");
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

        public Criteria andRoomsHasCandiateIsNull() {
            addCriterion("rooms_has_candiate is null");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateIsNotNull() {
            addCriterion("rooms_has_candiate is not null");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateEqualTo(Integer value) {
            addCriterion("rooms_has_candiate =", value, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateNotEqualTo(Integer value) {
            addCriterion("rooms_has_candiate <>", value, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateGreaterThan(Integer value) {
            addCriterion("rooms_has_candiate >", value, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rooms_has_candiate >=", value, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateLessThan(Integer value) {
            addCriterion("rooms_has_candiate <", value, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateLessThanOrEqualTo(Integer value) {
            addCriterion("rooms_has_candiate <=", value, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateIn(List<Integer> values) {
            addCriterion("rooms_has_candiate in", values, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateNotIn(List<Integer> values) {
            addCriterion("rooms_has_candiate not in", values, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateBetween(Integer value1, Integer value2) {
            addCriterion("rooms_has_candiate between", value1, value2, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andRoomsHasCandiateNotBetween(Integer value1, Integer value2) {
            addCriterion("rooms_has_candiate not between", value1, value2, "roomsHasCandiate");
            return (Criteria) this;
        }

        public Criteria andFloorPlanIsNull() {
            addCriterion("floor_plan is null");
            return (Criteria) this;
        }

        public Criteria andFloorPlanIsNotNull() {
            addCriterion("floor_plan is not null");
            return (Criteria) this;
        }

        public Criteria andFloorPlanEqualTo(String value) {
            addCriterion("floor_plan =", value, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanNotEqualTo(String value) {
            addCriterion("floor_plan <>", value, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanGreaterThan(String value) {
            addCriterion("floor_plan >", value, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanGreaterThanOrEqualTo(String value) {
            addCriterion("floor_plan >=", value, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanLessThan(String value) {
            addCriterion("floor_plan <", value, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanLessThanOrEqualTo(String value) {
            addCriterion("floor_plan <=", value, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanLike(String value) {
            addCriterion("floor_plan like", value, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanNotLike(String value) {
            addCriterion("floor_plan not like", value, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanIn(List<String> values) {
            addCriterion("floor_plan in", values, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanNotIn(List<String> values) {
            addCriterion("floor_plan not in", values, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanBetween(String value1, String value2) {
            addCriterion("floor_plan between", value1, value2, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andFloorPlanNotBetween(String value1, String value2) {
            addCriterion("floor_plan not between", value1, value2, "floorPlan");
            return (Criteria) this;
        }

        public Criteria andVituralIsNull() {
            addCriterion("vitural is null");
            return (Criteria) this;
        }

        public Criteria andVituralIsNotNull() {
            addCriterion("vitural is not null");
            return (Criteria) this;
        }

        public Criteria andVituralEqualTo(String value) {
            addCriterion("vitural =", value, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralNotEqualTo(String value) {
            addCriterion("vitural <>", value, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralGreaterThan(String value) {
            addCriterion("vitural >", value, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralGreaterThanOrEqualTo(String value) {
            addCriterion("vitural >=", value, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralLessThan(String value) {
            addCriterion("vitural <", value, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralLessThanOrEqualTo(String value) {
            addCriterion("vitural <=", value, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralLike(String value) {
            addCriterion("vitural like", value, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralNotLike(String value) {
            addCriterion("vitural not like", value, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralIn(List<String> values) {
            addCriterion("vitural in", values, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralNotIn(List<String> values) {
            addCriterion("vitural not in", values, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralBetween(String value1, String value2) {
            addCriterion("vitural between", value1, value2, "vitural");
            return (Criteria) this;
        }

        public Criteria andVituralNotBetween(String value1, String value2) {
            addCriterion("vitural not between", value1, value2, "vitural");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
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