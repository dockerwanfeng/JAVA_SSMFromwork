package com.kaige123.daomu.DAO.Bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VideocouresExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public VideocouresExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
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

        public Criteria andVcidIsNull() {
            addCriterion("vcid is null");
            return (Criteria) this;
        }

        public Criteria andVcidIsNotNull() {
            addCriterion("vcid is not null");
            return (Criteria) this;
        }

        public Criteria andVcidEqualTo(Long value) {
            addCriterion("vcid =", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotEqualTo(Long value) {
            addCriterion("vcid <>", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidGreaterThan(Long value) {
            addCriterion("vcid >", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidGreaterThanOrEqualTo(Long value) {
            addCriterion("vcid >=", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidLessThan(Long value) {
            addCriterion("vcid <", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidLessThanOrEqualTo(Long value) {
            addCriterion("vcid <=", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidIn(List<Long> values) {
            addCriterion("vcid in", values, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotIn(List<Long> values) {
            addCriterion("vcid not in", values, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidBetween(Long value1, Long value2) {
            addCriterion("vcid between", value1, value2, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotBetween(Long value1, Long value2) {
            addCriterion("vcid not between", value1, value2, "vcid");
            return (Criteria) this;
        }

        public Criteria andVctitleIsNull() {
            addCriterion("vcTitle is null");
            return (Criteria) this;
        }

        public Criteria andVctitleIsNotNull() {
            addCriterion("vcTitle is not null");
            return (Criteria) this;
        }

        public Criteria andVctitleEqualTo(String value) {
            addCriterion("vcTitle =", value, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleNotEqualTo(String value) {
            addCriterion("vcTitle <>", value, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleGreaterThan(String value) {
            addCriterion("vcTitle >", value, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleGreaterThanOrEqualTo(String value) {
            addCriterion("vcTitle >=", value, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleLessThan(String value) {
            addCriterion("vcTitle <", value, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleLessThanOrEqualTo(String value) {
            addCriterion("vcTitle <=", value, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleLike(String value) {
            addCriterion("vcTitle like", value, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleNotLike(String value) {
            addCriterion("vcTitle not like", value, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleIn(List<String> values) {
            addCriterion("vcTitle in", values, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleNotIn(List<String> values) {
            addCriterion("vcTitle not in", values, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleBetween(String value1, String value2) {
            addCriterion("vcTitle between", value1, value2, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVctitleNotBetween(String value1, String value2) {
            addCriterion("vcTitle not between", value1, value2, "vctitle");
            return (Criteria) this;
        }

        public Criteria andVtidIsNull() {
            addCriterion("vtid is null");
            return (Criteria) this;
        }

        public Criteria andVtidIsNotNull() {
            addCriterion("vtid is not null");
            return (Criteria) this;
        }

        public Criteria andVtidEqualTo(Long value) {
            addCriterion("vtid =", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidNotEqualTo(Long value) {
            addCriterion("vtid <>", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidGreaterThan(Long value) {
            addCriterion("vtid >", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidGreaterThanOrEqualTo(Long value) {
            addCriterion("vtid >=", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidLessThan(Long value) {
            addCriterion("vtid <", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidLessThanOrEqualTo(Long value) {
            addCriterion("vtid <=", value, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidIn(List<Long> values) {
            addCriterion("vtid in", values, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidNotIn(List<Long> values) {
            addCriterion("vtid not in", values, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidBetween(Long value1, Long value2) {
            addCriterion("vtid between", value1, value2, "vtid");
            return (Criteria) this;
        }

        public Criteria andVtidNotBetween(Long value1, Long value2) {
            addCriterion("vtid not between", value1, value2, "vtid");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionIsNull() {
            addCriterion("vcDescription is null");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionIsNotNull() {
            addCriterion("vcDescription is not null");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionEqualTo(String value) {
            addCriterion("vcDescription =", value, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionNotEqualTo(String value) {
            addCriterion("vcDescription <>", value, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionGreaterThan(String value) {
            addCriterion("vcDescription >", value, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("vcDescription >=", value, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionLessThan(String value) {
            addCriterion("vcDescription <", value, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionLessThanOrEqualTo(String value) {
            addCriterion("vcDescription <=", value, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionLike(String value) {
            addCriterion("vcDescription like", value, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionNotLike(String value) {
            addCriterion("vcDescription not like", value, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionIn(List<String> values) {
            addCriterion("vcDescription in", values, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionNotIn(List<String> values) {
            addCriterion("vcDescription not in", values, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionBetween(String value1, String value2) {
            addCriterion("vcDescription between", value1, value2, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andVcdescriptionNotBetween(String value1, String value2) {
            addCriterion("vcDescription not between", value1, value2, "vcdescription");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNull() {
            addCriterion("HeadImg is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNotNull() {
            addCriterion("HeadImg is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgEqualTo(String value) {
            addCriterion("HeadImg =", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotEqualTo(String value) {
            addCriterion("HeadImg <>", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThan(String value) {
            addCriterion("HeadImg >", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("HeadImg >=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThan(String value) {
            addCriterion("HeadImg <", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThanOrEqualTo(String value) {
            addCriterion("HeadImg <=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLike(String value) {
            addCriterion("HeadImg like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotLike(String value) {
            addCriterion("HeadImg not like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgIn(List<String> values) {
            addCriterion("HeadImg in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotIn(List<String> values) {
            addCriterion("HeadImg not in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgBetween(String value1, String value2) {
            addCriterion("HeadImg between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotBetween(String value1, String value2) {
            addCriterion("HeadImg not between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andVcimg1IsNull() {
            addCriterion("vcimg1 is null");
            return (Criteria) this;
        }

        public Criteria andVcimg1IsNotNull() {
            addCriterion("vcimg1 is not null");
            return (Criteria) this;
        }

        public Criteria andVcimg1EqualTo(String value) {
            addCriterion("vcimg1 =", value, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1NotEqualTo(String value) {
            addCriterion("vcimg1 <>", value, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1GreaterThan(String value) {
            addCriterion("vcimg1 >", value, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1GreaterThanOrEqualTo(String value) {
            addCriterion("vcimg1 >=", value, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1LessThan(String value) {
            addCriterion("vcimg1 <", value, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1LessThanOrEqualTo(String value) {
            addCriterion("vcimg1 <=", value, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1Like(String value) {
            addCriterion("vcimg1 like", value, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1NotLike(String value) {
            addCriterion("vcimg1 not like", value, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1In(List<String> values) {
            addCriterion("vcimg1 in", values, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1NotIn(List<String> values) {
            addCriterion("vcimg1 not in", values, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1Between(String value1, String value2) {
            addCriterion("vcimg1 between", value1, value2, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg1NotBetween(String value1, String value2) {
            addCriterion("vcimg1 not between", value1, value2, "vcimg1");
            return (Criteria) this;
        }

        public Criteria andVcimg2IsNull() {
            addCriterion("vcimg2 is null");
            return (Criteria) this;
        }

        public Criteria andVcimg2IsNotNull() {
            addCriterion("vcimg2 is not null");
            return (Criteria) this;
        }

        public Criteria andVcimg2EqualTo(String value) {
            addCriterion("vcimg2 =", value, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2NotEqualTo(String value) {
            addCriterion("vcimg2 <>", value, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2GreaterThan(String value) {
            addCriterion("vcimg2 >", value, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2GreaterThanOrEqualTo(String value) {
            addCriterion("vcimg2 >=", value, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2LessThan(String value) {
            addCriterion("vcimg2 <", value, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2LessThanOrEqualTo(String value) {
            addCriterion("vcimg2 <=", value, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2Like(String value) {
            addCriterion("vcimg2 like", value, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2NotLike(String value) {
            addCriterion("vcimg2 not like", value, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2In(List<String> values) {
            addCriterion("vcimg2 in", values, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2NotIn(List<String> values) {
            addCriterion("vcimg2 not in", values, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2Between(String value1, String value2) {
            addCriterion("vcimg2 between", value1, value2, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg2NotBetween(String value1, String value2) {
            addCriterion("vcimg2 not between", value1, value2, "vcimg2");
            return (Criteria) this;
        }

        public Criteria andVcimg3IsNull() {
            addCriterion("vcimg3 is null");
            return (Criteria) this;
        }

        public Criteria andVcimg3IsNotNull() {
            addCriterion("vcimg3 is not null");
            return (Criteria) this;
        }

        public Criteria andVcimg3EqualTo(String value) {
            addCriterion("vcimg3 =", value, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3NotEqualTo(String value) {
            addCriterion("vcimg3 <>", value, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3GreaterThan(String value) {
            addCriterion("vcimg3 >", value, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3GreaterThanOrEqualTo(String value) {
            addCriterion("vcimg3 >=", value, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3LessThan(String value) {
            addCriterion("vcimg3 <", value, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3LessThanOrEqualTo(String value) {
            addCriterion("vcimg3 <=", value, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3Like(String value) {
            addCriterion("vcimg3 like", value, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3NotLike(String value) {
            addCriterion("vcimg3 not like", value, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3In(List<String> values) {
            addCriterion("vcimg3 in", values, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3NotIn(List<String> values) {
            addCriterion("vcimg3 not in", values, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3Between(String value1, String value2) {
            addCriterion("vcimg3 between", value1, value2, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andVcimg3NotBetween(String value1, String value2) {
            addCriterion("vcimg3 not between", value1, value2, "vcimg3");
            return (Criteria) this;
        }

        public Criteria andUserseetypeIsNull() {
            addCriterion("userSeeType is null");
            return (Criteria) this;
        }

        public Criteria andUserseetypeIsNotNull() {
            addCriterion("userSeeType is not null");
            return (Criteria) this;
        }

        public Criteria andUserseetypeEqualTo(String value) {
            addCriterion("userSeeType =", value, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeNotEqualTo(String value) {
            addCriterion("userSeeType <>", value, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeGreaterThan(String value) {
            addCriterion("userSeeType >", value, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeGreaterThanOrEqualTo(String value) {
            addCriterion("userSeeType >=", value, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeLessThan(String value) {
            addCriterion("userSeeType <", value, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeLessThanOrEqualTo(String value) {
            addCriterion("userSeeType <=", value, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeLike(String value) {
            addCriterion("userSeeType like", value, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeNotLike(String value) {
            addCriterion("userSeeType not like", value, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeIn(List<String> values) {
            addCriterion("userSeeType in", values, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeNotIn(List<String> values) {
            addCriterion("userSeeType not in", values, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeBetween(String value1, String value2) {
            addCriterion("userSeeType between", value1, value2, "userseetype");
            return (Criteria) this;
        }

        public Criteria andUserseetypeNotBetween(String value1, String value2) {
            addCriterion("userSeeType not between", value1, value2, "userseetype");
            return (Criteria) this;
        }

        public Criteria andFullmonyIsNull() {
            addCriterion("FullMony is null");
            return (Criteria) this;
        }

        public Criteria andFullmonyIsNotNull() {
            addCriterion("FullMony is not null");
            return (Criteria) this;
        }

        public Criteria andFullmonyEqualTo(BigDecimal value) {
            addCriterion("FullMony =", value, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyNotEqualTo(BigDecimal value) {
            addCriterion("FullMony <>", value, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyGreaterThan(BigDecimal value) {
            addCriterion("FullMony >", value, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FullMony >=", value, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyLessThan(BigDecimal value) {
            addCriterion("FullMony <", value, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FullMony <=", value, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyIn(List<BigDecimal> values) {
            addCriterion("FullMony in", values, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyNotIn(List<BigDecimal> values) {
            addCriterion("FullMony not in", values, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FullMony between", value1, value2, "fullmony");
            return (Criteria) this;
        }

        public Criteria andFullmonyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FullMony not between", value1, value2, "fullmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyIsNull() {
            addCriterion("VIPMony is null");
            return (Criteria) this;
        }

        public Criteria andVipmonyIsNotNull() {
            addCriterion("VIPMony is not null");
            return (Criteria) this;
        }

        public Criteria andVipmonyEqualTo(BigDecimal value) {
            addCriterion("VIPMony =", value, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyNotEqualTo(BigDecimal value) {
            addCriterion("VIPMony <>", value, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyGreaterThan(BigDecimal value) {
            addCriterion("VIPMony >", value, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VIPMony >=", value, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyLessThan(BigDecimal value) {
            addCriterion("VIPMony <", value, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VIPMony <=", value, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyIn(List<BigDecimal> values) {
            addCriterion("VIPMony in", values, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyNotIn(List<BigDecimal> values) {
            addCriterion("VIPMony not in", values, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIPMony between", value1, value2, "vipmony");
            return (Criteria) this;
        }

        public Criteria andVipmonyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIPMony not between", value1, value2, "vipmony");
            return (Criteria) this;
        }

        public Criteria andSharemony1IsNull() {
            addCriterion("ShareMony1 is null");
            return (Criteria) this;
        }

        public Criteria andSharemony1IsNotNull() {
            addCriterion("ShareMony1 is not null");
            return (Criteria) this;
        }

        public Criteria andSharemony1EqualTo(BigDecimal value) {
            addCriterion("ShareMony1 =", value, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1NotEqualTo(BigDecimal value) {
            addCriterion("ShareMony1 <>", value, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1GreaterThan(BigDecimal value) {
            addCriterion("ShareMony1 >", value, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShareMony1 >=", value, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1LessThan(BigDecimal value) {
            addCriterion("ShareMony1 <", value, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShareMony1 <=", value, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1In(List<BigDecimal> values) {
            addCriterion("ShareMony1 in", values, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1NotIn(List<BigDecimal> values) {
            addCriterion("ShareMony1 not in", values, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShareMony1 between", value1, value2, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShareMony1 not between", value1, value2, "sharemony1");
            return (Criteria) this;
        }

        public Criteria andSharemony2IsNull() {
            addCriterion("ShareMony2 is null");
            return (Criteria) this;
        }

        public Criteria andSharemony2IsNotNull() {
            addCriterion("ShareMony2 is not null");
            return (Criteria) this;
        }

        public Criteria andSharemony2EqualTo(BigDecimal value) {
            addCriterion("ShareMony2 =", value, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2NotEqualTo(BigDecimal value) {
            addCriterion("ShareMony2 <>", value, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2GreaterThan(BigDecimal value) {
            addCriterion("ShareMony2 >", value, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShareMony2 >=", value, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2LessThan(BigDecimal value) {
            addCriterion("ShareMony2 <", value, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShareMony2 <=", value, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2In(List<BigDecimal> values) {
            addCriterion("ShareMony2 in", values, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2NotIn(List<BigDecimal> values) {
            addCriterion("ShareMony2 not in", values, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShareMony2 between", value1, value2, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSharemony2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShareMony2 not between", value1, value2, "sharemony2");
            return (Criteria) this;
        }

        public Criteria andSalenumberIsNull() {
            addCriterion("SaleNumber is null");
            return (Criteria) this;
        }

        public Criteria andSalenumberIsNotNull() {
            addCriterion("SaleNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSalenumberEqualTo(Integer value) {
            addCriterion("SaleNumber =", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberNotEqualTo(Integer value) {
            addCriterion("SaleNumber <>", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberGreaterThan(Integer value) {
            addCriterion("SaleNumber >", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleNumber >=", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberLessThan(Integer value) {
            addCriterion("SaleNumber <", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberLessThanOrEqualTo(Integer value) {
            addCriterion("SaleNumber <=", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberIn(List<Integer> values) {
            addCriterion("SaleNumber in", values, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberNotIn(List<Integer> values) {
            addCriterion("SaleNumber not in", values, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberBetween(Integer value1, Integer value2) {
            addCriterion("SaleNumber between", value1, value2, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleNumber not between", value1, value2, "salenumber");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table videocoures
     *
     * @mbg.generated do_not_delete_during_merge Sat Oct 13 11:12:28 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table videocoures
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
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