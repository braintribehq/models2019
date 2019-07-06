/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Dosage of the Data Model fhir.
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
{@link additionalInstruction}, 
{@link timing}, 
{@link asNeededCodeableConcept}, 
{@link site}, 
{@link route}, 
{@link method}, 
{@link doseAndRate}, 
{@link maxDosePerPeriod}, 
{@link maxDosePerAdministration}, 
{@link maxDosePerLifetime}, 

* It provides of then following operations (getters and setters)
{@link getAdditionalInstruction},
{@link getTiming},
{@link getAsNeededCodeableConcept},
{@link getSite},
{@link getRoute},
{@link getMethod},
{@link getDoseAndRate},
{@link getMaxDosePerPeriod},
{@link getMaxDosePerAdministration},
{@link getMaxDosePerLifetime},
{@link setAdditionalInstruction},
{@link setTiming},
{@link setAsNeededCodeableConcept},
{@link setSite},
{@link setRoute},
{@link setMethod},
{@link setDoseAndRate},
{@link setMaxDosePerPeriod},
{@link setMaxDosePerAdministration},
{@link setMaxDosePerLifetime},
 */

@Description("Indicates how the medication is/was taken or should be taken by the patient.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface Dosage extends GenericEntity, fhir.BackboneElement {

	EntityType<Dosage> T = EntityTypes.T(Dosage.class);

	/* Constants for each property name. */
	java.lang.String additionalInstruction = "additionalInstruction";
	java.lang.String timing = "timing";
	java.lang.String asNeededCodeableConcept = "asNeededCodeableConcept";
	java.lang.String site = "site";
	java.lang.String route = "route";
	java.lang.String method = "method";
	java.lang.String doseAndRate = "doseAndRate";
	java.lang.String maxDosePerPeriod = "maxDosePerPeriod";
	java.lang.String maxDosePerAdministration = "maxDosePerAdministration";
	java.lang.String maxDosePerLifetime = "maxDosePerLifetime";

	@Description("Supplemental instructions to the patient on how to take the medication  (e.g. 'with meals' or'take half to one hour before food') or warnings for the patient about the medication (e.g. 'may cause drowsiness' or 'avoid exposure of skin to direct sunlight or sunlamps').")
	
	java.util.List<fhir.CodeableConcept> getAdditionalInstruction();
	void setAdditionalInstruction(java.util.List<fhir.CodeableConcept> additionalInstruction);

	@Description("When medication should be administered.")
	@Mandatory
	fhir.Timing getTiming();
	void setTiming(fhir.Timing timing);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getAsNeededCodeableConcept();
	void setAsNeededCodeableConcept(fhir.CodeableConcept asNeededCodeableConcept);
	@Description("Body site to administer to.")
	@Mandatory
	fhir.CodeableConcept getSite();
	void setSite(fhir.CodeableConcept site);
	@Description("How drug should enter body.")
	@Mandatory
	fhir.CodeableConcept getRoute();
	void setRoute(fhir.CodeableConcept route);
	@Description("Technique for administering medication.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
	@Description("The amount of medication administered.")
	
	java.util.List<fhir.DosageDoseAndRate> getDoseAndRate();
	void setDoseAndRate(java.util.List<fhir.DosageDoseAndRate> doseAndRate);

	@Description("Upper limit on medication per unit of time.")
	@Mandatory
	fhir.Ratio getMaxDosePerPeriod();
	void setMaxDosePerPeriod(fhir.Ratio maxDosePerPeriod);
	@Description("Upper limit on medication per administration.")
	@Mandatory
	fhir.Quantity getMaxDosePerAdministration();
	void setMaxDosePerAdministration(fhir.Quantity maxDosePerAdministration);
	@Description("Upper limit on medication per lifetime of the patient.")
	@Mandatory
	fhir.Quantity getMaxDosePerLifetime();
	void setMaxDosePerLifetime(fhir.Quantity maxDosePerLifetime);
}
