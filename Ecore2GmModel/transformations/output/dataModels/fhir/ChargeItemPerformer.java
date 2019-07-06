/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ChargeItemPerformer of the Data Model fhir.
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
{@link function}, 
{@link actor}, 

* It provides of then following operations (getters and setters)
{@link getFunction},
{@link getActor},
{@link setFunction},
{@link setActor},
 */

@Description("The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.")

public interface ChargeItemPerformer extends GenericEntity, fhir.BackboneElement {

	EntityType<ChargeItemPerformer> T = EntityTypes.T(ChargeItemPerformer.class);

	/* Constants for each property name. */
	java.lang.String function = "function";
	java.lang.String actor = "actor";

	@Description("Describes the type of performance or participation(e.g. primary surgeon, anesthesiologiest, etc.).")
	@Mandatory
	fhir.CodeableConcept getFunction();
	void setFunction(fhir.CodeableConcept function);
	@Description("The device, practitioner, etc. who performed or participated in the service.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getActor();
	void setActor(com.braintribe.model.generic.GenericEntity actor);
}
