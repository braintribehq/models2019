/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductPackagedBatchIdentifier of the Data Model fhir.
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
{@link outerPackaging}, 
{@link immediatePackaging}, 

* It provides of then following operations (getters and setters)
{@link getOuterPackaging},
{@link getImmediatePackaging},
{@link setOuterPackaging},
{@link setImmediatePackaging},
 */

@Description("A medicinal product in a container or package.")

public interface MedicinalProductPackagedBatchIdentifier extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductPackagedBatchIdentifier> T = EntityTypes.T(MedicinalProductPackagedBatchIdentifier.class);

	/* Constants for each property name. */
	java.lang.String outerPackaging = "outerPackaging";
	java.lang.String immediatePackaging = "immediatePackaging";

	@Description("A number appearing on the outer packaging of a specific batch.")
	@Mandatory
	fhir.Identifier getOuterPackaging();
	void setOuterPackaging(fhir.Identifier outerPackaging);
	@Description("A number appearing on the immediate packaging (and not the outer packaging).")
	@Mandatory
	fhir.Identifier getImmediatePackaging();
	void setImmediatePackaging(fhir.Identifier immediatePackaging);
}
