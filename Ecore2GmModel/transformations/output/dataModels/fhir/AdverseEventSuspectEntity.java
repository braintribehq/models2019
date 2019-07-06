/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AdverseEventSuspectEntity of the Data Model fhir.
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
{@link instance}, 
{@link causality}, 

* It provides of then following operations (getters and setters)
{@link getInstance},
{@link getCausality},
{@link setInstance},
{@link setCausality},
 */

@Description("Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.")

public interface AdverseEventSuspectEntity extends GenericEntity, fhir.BackboneElement {

	EntityType<AdverseEventSuspectEntity> T = EntityTypes.T(AdverseEventSuspectEntity.class);

	/* Constants for each property name. */
	java.lang.String instance = "instance";
	java.lang.String causality = "causality";

	@Description("Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInstance();
	void setInstance(com.braintribe.model.generic.GenericEntity instance);
	@Description("Information on the possible cause of the event.")
	
	java.util.List<fhir.AdverseEventCausality> getCausality();
	void setCausality(java.util.List<fhir.AdverseEventCausality> causality);

}
