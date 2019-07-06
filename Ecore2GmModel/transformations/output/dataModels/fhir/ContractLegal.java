/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractLegal of the Data Model fhir.
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
{@link contentAttachment}, 
{@link contentReference}, 

* It provides of then following operations (getters and setters)
{@link getContentAttachment},
{@link getContentReference},
{@link setContentAttachment},
{@link setContentReference},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractLegal extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractLegal> T = EntityTypes.T(ContractLegal.class);

	/* Constants for each property name. */
	java.lang.String contentAttachment = "contentAttachment";
	java.lang.String contentReference = "contentReference";

	@Description("")
	@Mandatory
	fhir.Attachment getContentAttachment();
	void setContentAttachment(fhir.Attachment contentAttachment);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getContentReference();
	void setContentReference(com.braintribe.model.generic.GenericEntity contentReference);
}
