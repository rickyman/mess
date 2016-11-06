package cn.edu.tju.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSchoolActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSchoolActivityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNull() {
            addCriterion("schoolId is null");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNotNull() {
            addCriterion("schoolId is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolidEqualTo(Integer value) {
            addCriterion("schoolId =", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotEqualTo(Integer value) {
            addCriterion("schoolId <>", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThan(Integer value) {
            addCriterion("schoolId >", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolId >=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThan(Integer value) {
            addCriterion("schoolId <", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThanOrEqualTo(Integer value) {
            addCriterion("schoolId <=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidIn(List<Integer> values) {
            addCriterion("schoolId in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotIn(List<Integer> values) {
            addCriterion("schoolId not in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidBetween(Integer value1, Integer value2) {
            addCriterion("schoolId between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolId not between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(String value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(String value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(String value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(String value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(String value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLike(String value) {
            addCriterion("discount like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotLike(String value) {
            addCriterion("discount not like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<String> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<String> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(String value1, String value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(String value1, String value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andGrouponIsNull() {
            addCriterion("groupon is null");
            return (Criteria) this;
        }

        public Criteria andGrouponIsNotNull() {
            addCriterion("groupon is not null");
            return (Criteria) this;
        }

        public Criteria andGrouponEqualTo(String value) {
            addCriterion("groupon =", value, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponNotEqualTo(String value) {
            addCriterion("groupon <>", value, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponGreaterThan(String value) {
            addCriterion("groupon >", value, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponGreaterThanOrEqualTo(String value) {
            addCriterion("groupon >=", value, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponLessThan(String value) {
            addCriterion("groupon <", value, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponLessThanOrEqualTo(String value) {
            addCriterion("groupon <=", value, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponLike(String value) {
            addCriterion("groupon like", value, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponNotLike(String value) {
            addCriterion("groupon not like", value, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponIn(List<String> values) {
            addCriterion("groupon in", values, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponNotIn(List<String> values) {
            addCriterion("groupon not in", values, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponBetween(String value1, String value2) {
            addCriterion("groupon between", value1, value2, "groupon");
            return (Criteria) this;
        }

        public Criteria andGrouponNotBetween(String value1, String value2) {
            addCriterion("groupon not between", value1, value2, "groupon");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andFromTimeIsNull() {
            addCriterion("from_time is null");
            return (Criteria) this;
        }

        public Criteria andFromTimeIsNotNull() {
            addCriterion("from_time is not null");
            return (Criteria) this;
        }

        public Criteria andFromTimeEqualTo(Date value) {
            addCriterion("from_time =", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeNotEqualTo(Date value) {
            addCriterion("from_time <>", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeGreaterThan(Date value) {
            addCriterion("from_time >", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("from_time >=", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeLessThan(Date value) {
            addCriterion("from_time <", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeLessThanOrEqualTo(Date value) {
            addCriterion("from_time <=", value, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeIn(List<Date> values) {
            addCriterion("from_time in", values, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeNotIn(List<Date> values) {
            addCriterion("from_time not in", values, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeBetween(Date value1, Date value2) {
            addCriterion("from_time between", value1, value2, "fromTime");
            return (Criteria) this;
        }

        public Criteria andFromTimeNotBetween(Date value1, Date value2) {
            addCriterion("from_time not between", value1, value2, "fromTime");
            return (Criteria) this;
        }

        public Criteria andToTimeIsNull() {
            addCriterion("to_time is null");
            return (Criteria) this;
        }

        public Criteria andToTimeIsNotNull() {
            addCriterion("to_time is not null");
            return (Criteria) this;
        }

        public Criteria andToTimeEqualTo(Date value) {
            addCriterion("to_time =", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeNotEqualTo(Date value) {
            addCriterion("to_time <>", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeGreaterThan(Date value) {
            addCriterion("to_time >", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("to_time >=", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeLessThan(Date value) {
            addCriterion("to_time <", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeLessThanOrEqualTo(Date value) {
            addCriterion("to_time <=", value, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeIn(List<Date> values) {
            addCriterion("to_time in", values, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeNotIn(List<Date> values) {
            addCriterion("to_time not in", values, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeBetween(Date value1, Date value2) {
            addCriterion("to_time between", value1, value2, "toTime");
            return (Criteria) this;
        }

        public Criteria andToTimeNotBetween(Date value1, Date value2) {
            addCriterion("to_time not between", value1, value2, "toTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
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