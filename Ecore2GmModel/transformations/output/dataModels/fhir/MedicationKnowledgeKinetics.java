/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgeKinetics of the Data Model fhir.
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
{@link areaUnderCurve}, 
{@link lethalDose50}, 
{@link halfLifePeriod}, 

* It provides of then following operations (getters and setters)
{@link getAreaUnderCurve},
{@link getLethalDose50},
{@link getHalfLifePeriod},
{@link setAreaUnderCurve},
{@link setLethalDose50},
{@link setHalfLifePeriod},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgeKinetics extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgeKinetics> T = EntityTypes.T(MedicationKnowledgeKinetics.class);

	/* Constants for each property name. */
	java.lang.String areaUnderCurve = "areaUnderCurve";
	java.lang.String lethalDose50 = "lethalDose50";
	java.lang.String halfLifePeriod = "halfLifePeriod";

	@Description("The drug concentration measured at certain discrete points in time.")
	
	java.util.List<fhir.Quantity> getAreaUnderCurve();
	void setAreaUnderCurve(java.util.List<fhir.Quantity> areaUnderCurve);

	@Description("The median lethal dose of a drug.")
	
	java.util.List<fhir.Quantity> getLethalDose50();
	void setLethalDose50(java.util.List<fhir.Quantity> lethalDose50);

	@Description("The time required for any specified property (e.g., the concentration of a substance in the body) to decrease by half.")
	@Mandatory
	fhir.Duration getHalfLifePeriod();
	void setHalfLifePeriod(fhir.Duration halfLifePeriod);
}
