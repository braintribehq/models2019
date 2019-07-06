/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductAuthorizationProcedure of the Data Model fhir.
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
{@link identifier}, 
{@link type}, 
{@link datePeriod}, 
{@link application}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getDatePeriod},
{@link getApplication},
{@link setIdentifier},
{@link setType},
{@link setDatePeriod},
{@link setApplication},
 */

@Description("The regulatory authorization of a medicinal product.")

public interface MedicinalProductAuthorizationProcedure extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductAuthorizationProcedure> T = EntityTypes.T(MedicinalProductAuthorizationProcedure.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String datePeriod = "datePeriod";
	java.lang.String application = "application";

	@Description("Identifier for this procedure.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Type of procedure.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("")
	@Mandatory
	fhir.Period getDatePeriod();
	void setDatePeriod(fhir.Period datePeriod);
	@Description("Applcations submitted to obtain a marketing authorization.")
	
	java.util.List<fhir.MedicinalProductAuthorizationProcedure> getApplication();
	void setApplication(java.util.List<fhir.MedicinalProductAuthorizationProcedure> application);

}
