/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ConsentProvision of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link period}, 
{@link actor}, 
{@link action}, 
{@link securityLabel}, 
{@link purpose}, 
{@link class_}, 
{@link code}, 
{@link dataPeriod}, 
{@link data}, 
{@link provision}, 

* It provides of then following operations (getters and setters)
{@link getPeriod},
{@link getActor},
{@link getAction},
{@link getSecurityLabel},
{@link getPurpose},
{@link getClass_},
{@link getCode},
{@link getDataPeriod},
{@link getData},
{@link getProvision},
{@link setPeriod},
{@link setActor},
{@link setAction},
{@link setSecurityLabel},
{@link setPurpose},
{@link setClass_},
{@link setCode},
{@link setDataPeriod},
{@link setData},
{@link setProvision},
 */

@Description("A record of a healthcare consumer?s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.")

public interface ConsentProvision extends GenericEntity, fhir.BackboneElement {

	EntityType<ConsentProvision> T = EntityTypes.T(ConsentProvision.class);

	/* Constants for each property name. */
	java.lang.String period = "period";
	java.lang.String actor = "actor";
	java.lang.String action = "action";
	java.lang.String securityLabel = "securityLabel";
	java.lang.String purpose = "purpose";
	java.lang.String class_ = "class_";
	java.lang.String code = "code";
	java.lang.String dataPeriod = "dataPeriod";
	java.lang.String data = "data";
	java.lang.String provision = "provision";

	@Description("The timeframe in this rule is valid.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Who or what is controlled by this rule. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').")
	
	java.util.List<fhir.ConsentActor> getActor();
	void setActor(java.util.List<fhir.ConsentActor> actor);

	@Description("Actions controlled by this Rule.")
	
	java.util.List<fhir.CodeableConcept> getAction();
	void setAction(java.util.List<fhir.CodeableConcept> action);

	@Description("A security label, comprised of 0..* security label fields (Privacy tags), which define which resources are controlled by this exception.")
	
	java.util.List<fhir.Coding> getSecurityLabel();
	void setSecurityLabel(java.util.List<fhir.Coding> securityLabel);

	@Description("The context of the activities a user is taking - why the user is accessing the data - that are controlled by this rule.")
	
	java.util.List<fhir.Coding> getPurpose();
	void setPurpose(java.util.List<fhir.Coding> purpose);

	@Description("The class of information covered by this rule. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.")
	
	java.util.List<fhir.Coding> getClass_();
	void setClass_(java.util.List<fhir.Coding> class_);

	@Description("If this code is found in an instance, then the rule applies.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

	@Description("Clinical or Operational Relevant period of time that bounds the data controlled by this rule.")
	@Mandatory
	fhir.Period getDataPeriod();
	void setDataPeriod(fhir.Period dataPeriod);
	@Description("The resources controlled by this rule if specific resources are referenced.")
	
	java.util.List<fhir.ConsentData> getData();
	void setData(java.util.List<fhir.ConsentData> data);

	@Description("Rules which provide exceptions to the base rule or subrules.")
	
	java.util.List<fhir.ConsentProvision> getProvision();
	void setProvision(java.util.List<fhir.ConsentProvision> provision);

}
