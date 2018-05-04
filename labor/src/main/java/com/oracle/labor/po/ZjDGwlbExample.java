package com.oracle.labor.po;

import java.util.ArrayList;
import java.util.List;

public class ZjDGwlbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZjDGwlbExample() {
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

        public Criteria andDmidIsNull() {
            addCriterion("dmid is null");
            return (Criteria) this;
        }

        public Criteria andDmidIsNotNull() {
            addCriterion("dmid is not null");
            return (Criteria) this;
        }

        public Criteria andDmidEqualTo(String value) {
            addCriterion("dmid =", value, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidNotEqualTo(String value) {
            addCriterion("dmid <>", value, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidGreaterThan(String value) {
            addCriterion("dmid >", value, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidGreaterThanOrEqualTo(String value) {
            addCriterion("dmid >=", value, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidLessThan(String value) {
            addCriterion("dmid <", value, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidLessThanOrEqualTo(String value) {
            addCriterion("dmid <=", value, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidLike(String value) {
            addCriterion("dmid like", value, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidNotLike(String value) {
            addCriterion("dmid not like", value, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidIn(List<String> values) {
            addCriterion("dmid in", values, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidNotIn(List<String> values) {
            addCriterion("dmid not in", values, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidBetween(String value1, String value2) {
            addCriterion("dmid between", value1, value2, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmidNotBetween(String value1, String value2) {
            addCriterion("dmid not between", value1, value2, "dmid");
            return (Criteria) this;
        }

        public Criteria andDmmcIsNull() {
            addCriterion("dmmc is null");
            return (Criteria) this;
        }

        public Criteria andDmmcIsNotNull() {
            addCriterion("dmmc is not null");
            return (Criteria) this;
        }

        public Criteria andDmmcEqualTo(String value) {
            addCriterion("dmmc =", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotEqualTo(String value) {
            addCriterion("dmmc <>", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcGreaterThan(String value) {
            addCriterion("dmmc >", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcGreaterThanOrEqualTo(String value) {
            addCriterion("dmmc >=", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLessThan(String value) {
            addCriterion("dmmc <", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLessThanOrEqualTo(String value) {
            addCriterion("dmmc <=", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcLike(String value) {
            addCriterion("dmmc like", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotLike(String value) {
            addCriterion("dmmc not like", value, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcIn(List<String> values) {
            addCriterion("dmmc in", values, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotIn(List<String> values) {
            addCriterion("dmmc not in", values, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcBetween(String value1, String value2) {
            addCriterion("dmmc between", value1, value2, "dmmc");
            return (Criteria) this;
        }

        public Criteria andDmmcNotBetween(String value1, String value2) {
            addCriterion("dmmc not between", value1, value2, "dmmc");
            return (Criteria) this;
        }

        public Criteria andSfkyIsNull() {
            addCriterion("sfky is null");
            return (Criteria) this;
        }

        public Criteria andSfkyIsNotNull() {
            addCriterion("sfky is not null");
            return (Criteria) this;
        }

        public Criteria andSfkyEqualTo(String value) {
            addCriterion("sfky =", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyNotEqualTo(String value) {
            addCriterion("sfky <>", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyGreaterThan(String value) {
            addCriterion("sfky >", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyGreaterThanOrEqualTo(String value) {
            addCriterion("sfky >=", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyLessThan(String value) {
            addCriterion("sfky <", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyLessThanOrEqualTo(String value) {
            addCriterion("sfky <=", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyLike(String value) {
            addCriterion("sfky like", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyNotLike(String value) {
            addCriterion("sfky not like", value, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyIn(List<String> values) {
            addCriterion("sfky in", values, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyNotIn(List<String> values) {
            addCriterion("sfky not in", values, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyBetween(String value1, String value2) {
            addCriterion("sfky between", value1, value2, "sfky");
            return (Criteria) this;
        }

        public Criteria andSfkyNotBetween(String value1, String value2) {
            addCriterion("sfky not between", value1, value2, "sfky");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("xh is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("xh is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(Integer value) {
            addCriterion("xh =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(Integer value) {
            addCriterion("xh <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(Integer value) {
            addCriterion("xh >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(Integer value) {
            addCriterion("xh >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(Integer value) {
            addCriterion("xh <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(Integer value) {
            addCriterion("xh <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<Integer> values) {
            addCriterion("xh in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<Integer> values) {
            addCriterion("xh not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(Integer value1, Integer value2) {
            addCriterion("xh between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(Integer value1, Integer value2) {
            addCriterion("xh not between", value1, value2, "xh");
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