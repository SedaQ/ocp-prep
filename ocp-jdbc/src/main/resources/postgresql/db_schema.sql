--
-- PostgreSQL database dump
--

-- Dumped from database version 10.4
-- Dumped by pg_dump version 10.4

-- Started on 2018-09-23 13:34:47

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12278)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2235 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 19394)
-- Name: address; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.address (
    id_address bigint NOT NULL,
    city character varying(45) NOT NULL,
    house_number integer NOT NULL,
    street character varying(45) NOT NULL,
    zip_code character varying(45)
);


ALTER TABLE public.address OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 19397)
-- Name: address_id_address_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.address_id_address_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.address_id_address_seq OWNER TO postgres;

--
-- TOC entry 2236 (class 0 OID 0)
-- Dependencies: 197
-- Name: address_id_address_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.address_id_address_seq OWNED BY public.address.id_address;


--
-- TOC entry 198 (class 1259 OID 19399)
-- Name: contact; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contact (
    id_contact bigint NOT NULL,
    contact character varying(45) NOT NULL,
    id_contact_type bigint,
    id_person bigint
);


ALTER TABLE public.contact OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 19402)
-- Name: contact_id_contact_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contact_id_contact_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contact_id_contact_seq OWNER TO postgres;

--
-- TOC entry 2237 (class 0 OID 0)
-- Dependencies: 199
-- Name: contact_id_contact_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.contact_id_contact_seq OWNED BY public.contact.id_contact;


--
-- TOC entry 200 (class 1259 OID 19404)
-- Name: contact_type; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contact_type (
    id_contact_type bigint NOT NULL,
    title character varying(45) NOT NULL
);


ALTER TABLE public.contact_type OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 19407)
-- Name: contact_type_id_contact_type_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contact_type_id_contact_type_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contact_type_id_contact_type_seq OWNER TO postgres;

--
-- TOC entry 2238 (class 0 OID 0)
-- Dependencies: 201
-- Name: contact_type_id_contact_type_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.contact_type_id_contact_type_seq OWNED BY public.contact_type.id_contact_type;


--
-- TOC entry 202 (class 1259 OID 19409)
-- Name: meeting; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.meeting (
    id_meeting bigint NOT NULL,
    duration bigint NOT NULL,
    note character varying(1000),
    place character varying(200) NOT NULL,
    start_time timestamp without time zone NOT NULL
);


ALTER TABLE public.meeting OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 19415)
-- Name: meeting_id_meeting_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.meeting_id_meeting_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.meeting_id_meeting_seq OWNER TO postgres;

--
-- TOC entry 2239 (class 0 OID 0)
-- Dependencies: 203
-- Name: meeting_id_meeting_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.meeting_id_meeting_seq OWNED BY public.meeting.id_meeting;


--
-- TOC entry 204 (class 1259 OID 19417)
-- Name: person; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.person (
    id_person bigint NOT NULL,
    age integer,
    birthday date,
    email character varying(100) NOT NULL,
    first_name character varying(45) NOT NULL,
    nickname character varying(45) NOT NULL,
    pwd character varying(255) NOT NULL,
    surname character varying(45) NOT NULL,
    id_address bigint
);


ALTER TABLE public.person OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 19423)
-- Name: person_has_meeting; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.person_has_meeting (
    id_person bigint NOT NULL,
    id_meeting bigint NOT NULL
);


ALTER TABLE public.person_has_meeting OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 19426)
-- Name: person_id_person_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.person_id_person_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.person_id_person_seq OWNER TO postgres;

--
-- TOC entry 2240 (class 0 OID 0)
-- Dependencies: 206
-- Name: person_id_person_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.person_id_person_seq OWNED BY public.person.id_person;


--
-- TOC entry 207 (class 1259 OID 19428)
-- Name: person_role; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.person_role (
    id_person bigint NOT NULL,
    role character varying(255) NOT NULL
);


ALTER TABLE public.person_role OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 19431)
-- Name: relationship; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.relationship (
    id_relationship bigint NOT NULL,
    note character varying(200),
    id_person1 bigint,
    id_person2 bigint,
    id_relationship_type bigint
);


ALTER TABLE public.relationship OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 19434)
-- Name: relationship_id_relationship_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.relationship_id_relationship_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.relationship_id_relationship_seq OWNER TO postgres;

--
-- TOC entry 2241 (class 0 OID 0)
-- Dependencies: 209
-- Name: relationship_id_relationship_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.relationship_id_relationship_seq OWNED BY public.relationship.id_relationship;


--
-- TOC entry 210 (class 1259 OID 19436)
-- Name: relationship_type; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.relationship_type (
    id_relationship_type bigint NOT NULL,
    title character varying(255) NOT NULL
);


ALTER TABLE public.relationship_type OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 19439)
-- Name: relationship_type_id_relationship_type_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.relationship_type_id_relationship_type_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.relationship_type_id_relationship_type_seq OWNER TO postgres;

--
-- TOC entry 2242 (class 0 OID 0)
-- Dependencies: 211
-- Name: relationship_type_id_relationship_type_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.relationship_type_id_relationship_type_seq OWNED BY public.relationship_type.id_relationship_type;


--
-- TOC entry 2070 (class 2604 OID 19441)
-- Name: address id_address; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.address ALTER COLUMN id_address SET DEFAULT nextval('public.address_id_address_seq'::regclass);


--
-- TOC entry 2071 (class 2604 OID 19442)
-- Name: contact id_contact; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact ALTER COLUMN id_contact SET DEFAULT nextval('public.contact_id_contact_seq'::regclass);


--
-- TOC entry 2072 (class 2604 OID 19443)
-- Name: contact_type id_contact_type; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_type ALTER COLUMN id_contact_type SET DEFAULT nextval('public.contact_type_id_contact_type_seq'::regclass);


--
-- TOC entry 2073 (class 2604 OID 19444)
-- Name: meeting id_meeting; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.meeting ALTER COLUMN id_meeting SET DEFAULT nextval('public.meeting_id_meeting_seq'::regclass);


--
-- TOC entry 2074 (class 2604 OID 19445)
-- Name: person id_person; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person ALTER COLUMN id_person SET DEFAULT nextval('public.person_id_person_seq'::regclass);


--
-- TOC entry 2075 (class 2604 OID 19446)
-- Name: relationship id_relationship; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.relationship ALTER COLUMN id_relationship SET DEFAULT nextval('public.relationship_id_relationship_seq'::regclass);


--
-- TOC entry 2076 (class 2604 OID 19447)
-- Name: relationship_type id_relationship_type; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.relationship_type ALTER COLUMN id_relationship_type SET DEFAULT nextval('public.relationship_type_id_relationship_type_seq'::regclass);


--
-- TOC entry 2078 (class 2606 OID 19449)
-- Name: address address_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.address
    ADD CONSTRAINT address_pkey PRIMARY KEY (id_address);


--
-- TOC entry 2080 (class 2606 OID 19451)
-- Name: contact contact_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact
    ADD CONSTRAINT contact_pkey PRIMARY KEY (id_contact);


--
-- TOC entry 2082 (class 2606 OID 19453)
-- Name: contact_type contact_type_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_type
    ADD CONSTRAINT contact_type_pkey PRIMARY KEY (id_contact_type);


--
-- TOC entry 2086 (class 2606 OID 19455)
-- Name: meeting meeting_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.meeting
    ADD CONSTRAINT meeting_pkey PRIMARY KEY (id_meeting);


--
-- TOC entry 2090 (class 2606 OID 19457)
-- Name: person_has_meeting person_has_meeting_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person_has_meeting
    ADD CONSTRAINT person_has_meeting_pkey PRIMARY KEY (id_person, id_meeting);


--
-- TOC entry 2088 (class 2606 OID 19459)
-- Name: person person_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person
    ADD CONSTRAINT person_pkey PRIMARY KEY (id_person);


--
-- TOC entry 2092 (class 2606 OID 19461)
-- Name: person_role person_role_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person_role
    ADD CONSTRAINT person_role_pkey PRIMARY KEY (id_person, role);


--
-- TOC entry 2094 (class 2606 OID 19463)
-- Name: relationship relationship_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.relationship
    ADD CONSTRAINT relationship_pkey PRIMARY KEY (id_relationship);


--
-- TOC entry 2096 (class 2606 OID 19465)
-- Name: relationship_type relationship_type_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.relationship_type
    ADD CONSTRAINT relationship_type_pkey PRIMARY KEY (id_relationship_type);


--
-- TOC entry 2084 (class 2606 OID 19467)
-- Name: contact_type uk_1fq45jis28gt2u2qt757e04vy; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact_type
    ADD CONSTRAINT uk_1fq45jis28gt2u2qt757e04vy UNIQUE (title);


--
-- TOC entry 2098 (class 2606 OID 19469)
-- Name: relationship_type uk_r42xwql4glcbqp0y3r3mo4tac; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.relationship_type
    ADD CONSTRAINT uk_r42xwql4glcbqp0y3r3mo4tac UNIQUE (title);


--
-- TOC entry 2105 (class 2606 OID 19470)
-- Name: relationship fk3b7pcnfgfdblhublf8t8dvn9l; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.relationship
    ADD CONSTRAINT fk3b7pcnfgfdblhublf8t8dvn9l FOREIGN KEY (id_relationship_type) REFERENCES public.relationship_type(id_relationship_type);


--
-- TOC entry 2102 (class 2606 OID 19475)
-- Name: person_has_meeting fk6nyhtkxr5sh5ffdcxefbnwfjj; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person_has_meeting
    ADD CONSTRAINT fk6nyhtkxr5sh5ffdcxefbnwfjj FOREIGN KEY (id_meeting) REFERENCES public.person(id_person);


--
-- TOC entry 2103 (class 2606 OID 19480)
-- Name: person_has_meeting fk92pqvoxbjila4o02fp18rstq4; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person_has_meeting
    ADD CONSTRAINT fk92pqvoxbjila4o02fp18rstq4 FOREIGN KEY (id_person) REFERENCES public.meeting(id_meeting);


--
-- TOC entry 2106 (class 2606 OID 19485)
-- Name: relationship fkahw6wujjfkm21yqfhar09k3fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.relationship
    ADD CONSTRAINT fkahw6wujjfkm21yqfhar09k3fk FOREIGN KEY (id_person1) REFERENCES public.person(id_person);


--
-- TOC entry 2107 (class 2606 OID 19490)
-- Name: relationship fkdkyv2jjonl0trwvbsnmw7wugr; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.relationship
    ADD CONSTRAINT fkdkyv2jjonl0trwvbsnmw7wugr FOREIGN KEY (id_person2) REFERENCES public.person(id_person);


--
-- TOC entry 2104 (class 2606 OID 19495)
-- Name: person_role fkqbljdqxhnn666ss0ex4fnbm34; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person_role
    ADD CONSTRAINT fkqbljdqxhnn666ss0ex4fnbm34 FOREIGN KEY (id_person) REFERENCES public.person(id_person);


--
-- TOC entry 2099 (class 2606 OID 19500)
-- Name: contact fksdofi6j6flua1it19rnx6xcvb; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact
    ADD CONSTRAINT fksdofi6j6flua1it19rnx6xcvb FOREIGN KEY (id_person) REFERENCES public.person(id_person);


--
-- TOC entry 2101 (class 2606 OID 19505)
-- Name: person fksukp9r53qgth8ex065xwuw86t; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person
    ADD CONSTRAINT fksukp9r53qgth8ex065xwuw86t FOREIGN KEY (id_address) REFERENCES public.address(id_address);


--
-- TOC entry 2100 (class 2606 OID 19510)
-- Name: contact fkx0wbmi3et03b7xwys8sa0d7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contact
    ADD CONSTRAINT fkx0wbmi3et03b7xwys8sa0d7 FOREIGN KEY (id_contact_type) REFERENCES public.contact_type(id_contact_type);


-- Completed on 2018-09-23 13:34:48

--
-- PostgreSQL database dump complete
--

