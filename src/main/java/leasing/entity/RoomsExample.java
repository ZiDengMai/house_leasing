package leasing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomsExample() {
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

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("unit_id like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("unit_id not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
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

        public Criteria andRoomInfoIsNull() {
            addCriterion("room_info is null");
            return (Criteria) this;
        }

        public Criteria andRoomInfoIsNotNull() {
            addCriterion("room_info is not null");
            return (Criteria) this;
        }

        public Criteria andRoomInfoEqualTo(String value) {
            addCriterion("room_info =", value, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoNotEqualTo(String value) {
            addCriterion("room_info <>", value, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoGreaterThan(String value) {
            addCriterion("room_info >", value, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoGreaterThanOrEqualTo(String value) {
            addCriterion("room_info >=", value, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoLessThan(String value) {
            addCriterion("room_info <", value, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoLessThanOrEqualTo(String value) {
            addCriterion("room_info <=", value, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoLike(String value) {
            addCriterion("room_info like", value, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoNotLike(String value) {
            addCriterion("room_info not like", value, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoIn(List<String> values) {
            addCriterion("room_info in", values, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoNotIn(List<String> values) {
            addCriterion("room_info not in", values, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoBetween(String value1, String value2) {
            addCriterion("room_info between", value1, value2, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andRoomInfoNotBetween(String value1, String value2) {
            addCriterion("room_info not between", value1, value2, "roomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoIsNull() {
            addCriterion("bathroom_info is null");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoIsNotNull() {
            addCriterion("bathroom_info is not null");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoEqualTo(String value) {
            addCriterion("bathroom_info =", value, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoNotEqualTo(String value) {
            addCriterion("bathroom_info <>", value, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoGreaterThan(String value) {
            addCriterion("bathroom_info >", value, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoGreaterThanOrEqualTo(String value) {
            addCriterion("bathroom_info >=", value, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoLessThan(String value) {
            addCriterion("bathroom_info <", value, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoLessThanOrEqualTo(String value) {
            addCriterion("bathroom_info <=", value, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoLike(String value) {
            addCriterion("bathroom_info like", value, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoNotLike(String value) {
            addCriterion("bathroom_info not like", value, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoIn(List<String> values) {
            addCriterion("bathroom_info in", values, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoNotIn(List<String> values) {
            addCriterion("bathroom_info not in", values, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoBetween(String value1, String value2) {
            addCriterion("bathroom_info between", value1, value2, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBathroomInfoNotBetween(String value1, String value2) {
            addCriterion("bathroom_info not between", value1, value2, "bathroomInfo");
            return (Criteria) this;
        }

        public Criteria andBaselineIsNull() {
            addCriterion("baseline is null");
            return (Criteria) this;
        }

        public Criteria andBaselineIsNotNull() {
            addCriterion("baseline is not null");
            return (Criteria) this;
        }

        public Criteria andBaselineEqualTo(Integer value) {
            addCriterion("baseline =", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineNotEqualTo(Integer value) {
            addCriterion("baseline <>", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineGreaterThan(Integer value) {
            addCriterion("baseline >", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineGreaterThanOrEqualTo(Integer value) {
            addCriterion("baseline >=", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineLessThan(Integer value) {
            addCriterion("baseline <", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineLessThanOrEqualTo(Integer value) {
            addCriterion("baseline <=", value, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineIn(List<Integer> values) {
            addCriterion("baseline in", values, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineNotIn(List<Integer> values) {
            addCriterion("baseline not in", values, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineBetween(Integer value1, Integer value2) {
            addCriterion("baseline between", value1, value2, "baseline");
            return (Criteria) this;
        }

        public Criteria andBaselineNotBetween(Integer value1, Integer value2) {
            addCriterion("baseline not between", value1, value2, "baseline");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceIsNull() {
            addCriterion("official_price is null");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceIsNotNull() {
            addCriterion("official_price is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceEqualTo(Integer value) {
            addCriterion("official_price =", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceNotEqualTo(Integer value) {
            addCriterion("official_price <>", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceGreaterThan(Integer value) {
            addCriterion("official_price >", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("official_price >=", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceLessThan(Integer value) {
            addCriterion("official_price <", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceLessThanOrEqualTo(Integer value) {
            addCriterion("official_price <=", value, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceIn(List<Integer> values) {
            addCriterion("official_price in", values, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceNotIn(List<Integer> values) {
            addCriterion("official_price not in", values, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceBetween(Integer value1, Integer value2) {
            addCriterion("official_price between", value1, value2, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andOfficialPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("official_price not between", value1, value2, "officialPrice");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomIsNull() {
            addCriterion("private_bathroom is null");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomIsNotNull() {
            addCriterion("private_bathroom is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomEqualTo(Integer value) {
            addCriterion("private_bathroom =", value, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomNotEqualTo(Integer value) {
            addCriterion("private_bathroom <>", value, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomGreaterThan(Integer value) {
            addCriterion("private_bathroom >", value, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("private_bathroom >=", value, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomLessThan(Integer value) {
            addCriterion("private_bathroom <", value, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomLessThanOrEqualTo(Integer value) {
            addCriterion("private_bathroom <=", value, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomIn(List<Integer> values) {
            addCriterion("private_bathroom in", values, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomNotIn(List<Integer> values) {
            addCriterion("private_bathroom not in", values, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomBetween(Integer value1, Integer value2) {
            addCriterion("private_bathroom between", value1, value2, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andPrivateBathroomNotBetween(Integer value1, Integer value2) {
            addCriterion("private_bathroom not between", value1, value2, "privateBathroom");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberIsNull() {
            addCriterion("rooms_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberIsNotNull() {
            addCriterion("rooms_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberEqualTo(Integer value) {
            addCriterion("rooms_number =", value, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberNotEqualTo(Integer value) {
            addCriterion("rooms_number <>", value, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberGreaterThan(Integer value) {
            addCriterion("rooms_number >", value, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("rooms_number >=", value, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberLessThan(Integer value) {
            addCriterion("rooms_number <", value, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("rooms_number <=", value, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberIn(List<Integer> values) {
            addCriterion("rooms_number in", values, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberNotIn(List<Integer> values) {
            addCriterion("rooms_number not in", values, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberBetween(Integer value1, Integer value2) {
            addCriterion("rooms_number between", value1, value2, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andRoomsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("rooms_number not between", value1, value2, "roomsNumber");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingIsNull() {
            addCriterion("open_to_leasing is null");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingIsNotNull() {
            addCriterion("open_to_leasing is not null");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingEqualTo(Integer value) {
            addCriterion("open_to_leasing =", value, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingNotEqualTo(Integer value) {
            addCriterion("open_to_leasing <>", value, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingGreaterThan(Integer value) {
            addCriterion("open_to_leasing >", value, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_to_leasing >=", value, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingLessThan(Integer value) {
            addCriterion("open_to_leasing <", value, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingLessThanOrEqualTo(Integer value) {
            addCriterion("open_to_leasing <=", value, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingIn(List<Integer> values) {
            addCriterion("open_to_leasing in", values, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingNotIn(List<Integer> values) {
            addCriterion("open_to_leasing not in", values, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingBetween(Integer value1, Integer value2) {
            addCriterion("open_to_leasing between", value1, value2, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andOpenToLeasingNotBetween(Integer value1, Integer value2) {
            addCriterion("open_to_leasing not between", value1, value2, "openToLeasing");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterIsNull() {
            addCriterion("available_for_register is null");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterIsNotNull() {
            addCriterion("available_for_register is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterEqualTo(Integer value) {
            addCriterion("available_for_register =", value, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterNotEqualTo(Integer value) {
            addCriterion("available_for_register <>", value, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterGreaterThan(Integer value) {
            addCriterion("available_for_register >", value, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterGreaterThanOrEqualTo(Integer value) {
            addCriterion("available_for_register >=", value, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterLessThan(Integer value) {
            addCriterion("available_for_register <", value, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterLessThanOrEqualTo(Integer value) {
            addCriterion("available_for_register <=", value, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterIn(List<Integer> values) {
            addCriterion("available_for_register in", values, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterNotIn(List<Integer> values) {
            addCriterion("available_for_register not in", values, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterBetween(Integer value1, Integer value2) {
            addCriterion("available_for_register between", value1, value2, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailableForRegisterNotBetween(Integer value1, Integer value2) {
            addCriterion("available_for_register not between", value1, value2, "availableForRegister");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIsNull() {
            addCriterion("availability is null");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIsNotNull() {
            addCriterion("availability is not null");
            return (Criteria) this;
        }

        public Criteria andAvailabilityEqualTo(String value) {
            addCriterion("availability =", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotEqualTo(String value) {
            addCriterion("availability <>", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityGreaterThan(String value) {
            addCriterion("availability >", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityGreaterThanOrEqualTo(String value) {
            addCriterion("availability >=", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLessThan(String value) {
            addCriterion("availability <", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLessThanOrEqualTo(String value) {
            addCriterion("availability <=", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLike(String value) {
            addCriterion("availability like", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotLike(String value) {
            addCriterion("availability not like", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIn(List<String> values) {
            addCriterion("availability in", values, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotIn(List<String> values) {
            addCriterion("availability not in", values, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityBetween(String value1, String value2) {
            addCriterion("availability between", value1, value2, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotBetween(String value1, String value2) {
            addCriterion("availability not between", value1, value2, "availability");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNull() {
            addCriterion("details is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("details is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("details =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("details <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("details >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("details >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("details <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("details <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("details like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("details not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("details in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("details not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("details between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("details not between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListIsNull() {
            addCriterion("candidates_on_list is null");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListIsNotNull() {
            addCriterion("candidates_on_list is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListEqualTo(Integer value) {
            addCriterion("candidates_on_list =", value, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListNotEqualTo(Integer value) {
            addCriterion("candidates_on_list <>", value, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListGreaterThan(Integer value) {
            addCriterion("candidates_on_list >", value, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidates_on_list >=", value, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListLessThan(Integer value) {
            addCriterion("candidates_on_list <", value, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListLessThanOrEqualTo(Integer value) {
            addCriterion("candidates_on_list <=", value, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListIn(List<Integer> values) {
            addCriterion("candidates_on_list in", values, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListNotIn(List<Integer> values) {
            addCriterion("candidates_on_list not in", values, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListBetween(Integer value1, Integer value2) {
            addCriterion("candidates_on_list between", value1, value2, "candidatesOnList");
            return (Criteria) this;
        }

        public Criteria andCandidatesOnListNotBetween(Integer value1, Integer value2) {
            addCriterion("candidates_on_list not between", value1, value2, "candidatesOnList");
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

        public Criteria andReserceStatusIsNull() {
            addCriterion("reserce_status is null");
            return (Criteria) this;
        }

        public Criteria andReserceStatusIsNotNull() {
            addCriterion("reserce_status is not null");
            return (Criteria) this;
        }

        public Criteria andReserceStatusEqualTo(String value) {
            addCriterion("reserce_status =", value, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusNotEqualTo(String value) {
            addCriterion("reserce_status <>", value, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusGreaterThan(String value) {
            addCriterion("reserce_status >", value, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("reserce_status >=", value, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusLessThan(String value) {
            addCriterion("reserce_status <", value, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusLessThanOrEqualTo(String value) {
            addCriterion("reserce_status <=", value, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusLike(String value) {
            addCriterion("reserce_status like", value, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusNotLike(String value) {
            addCriterion("reserce_status not like", value, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusIn(List<String> values) {
            addCriterion("reserce_status in", values, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusNotIn(List<String> values) {
            addCriterion("reserce_status not in", values, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusBetween(String value1, String value2) {
            addCriterion("reserce_status between", value1, value2, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andReserceStatusNotBetween(String value1, String value2) {
            addCriterion("reserce_status not between", value1, value2, "reserceStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusIsNull() {
            addCriterion("contract_deposit_status is null");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusIsNotNull() {
            addCriterion("contract_deposit_status is not null");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusEqualTo(String value) {
            addCriterion("contract_deposit_status =", value, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusNotEqualTo(String value) {
            addCriterion("contract_deposit_status <>", value, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusGreaterThan(String value) {
            addCriterion("contract_deposit_status >", value, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusGreaterThanOrEqualTo(String value) {
            addCriterion("contract_deposit_status >=", value, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusLessThan(String value) {
            addCriterion("contract_deposit_status <", value, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusLessThanOrEqualTo(String value) {
            addCriterion("contract_deposit_status <=", value, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusLike(String value) {
            addCriterion("contract_deposit_status like", value, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusNotLike(String value) {
            addCriterion("contract_deposit_status not like", value, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusIn(List<String> values) {
            addCriterion("contract_deposit_status in", values, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusNotIn(List<String> values) {
            addCriterion("contract_deposit_status not in", values, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusBetween(String value1, String value2) {
            addCriterion("contract_deposit_status between", value1, value2, "contractDepositStatus");
            return (Criteria) this;
        }

        public Criteria andContractDepositStatusNotBetween(String value1, String value2) {
            addCriterion("contract_deposit_status not between", value1, value2, "contractDepositStatus");
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

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Integer value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Integer value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Integer value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Integer value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Integer value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Integer> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Integer> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Integer value1, Integer value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
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