/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractSecurityLabel of the Data Model fhir.
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
{@link classification}, 
{@link category}, 
{@link control}, 

* It provides of then following operations (getters and setters)
{@link getClassification},
{@link getCategory},
{@link getControl},
{@link setClassification},
{@link setCategory},
{@link setControl},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractSecurityLabel extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractSecurityLabel> T = EntityTypes.T(ContractSecurityLabel.class);

	/* Constants for each property name. */
	java.lang.String classification = "classification";
	java.lang.String category = "category";
	java.lang.String control = "control";

	@Description("Security label privacy tag that species the level of confidentiality protection required for this term and/or term elements.")
	@Mandatory
	fhir.Coding getClassification();
	void setClassification(fhir.Coding classification);
	@Description("Security label privacy tag that species the applicable privacy and security policies governing this term and/or term elements.")
	
	java.util.List<fhir.Coding> getCategory();
	void setCategory(java.util.List<fhir.Coding> category);

	@Description("Security label privacy tag that species the manner in which term and/or term elements are to be protected.")
	
	java.util.List<fhir.Coding> getControl();
	void setControl(java.util.List<fhir.Coding> control);

}
