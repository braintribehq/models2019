/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DataRequirement of the Data Model fhir.
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
{@link subjectCodeableConcept}, 
{@link subjectReference}, 
{@link codeFilter}, 
{@link dateFilter}, 
{@link sort}, 

* It provides of then following operations (getters and setters)
{@link getSubjectCodeableConcept},
{@link getSubjectReference},
{@link getCodeFilter},
{@link getDateFilter},
{@link getSort},
{@link setSubjectCodeableConcept},
{@link setSubjectReference},
{@link setCodeFilter},
{@link setDateFilter},
{@link setSort},
 */

@Description("Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface DataRequirement extends GenericEntity {

	EntityType<DataRequirement> T = EntityTypes.T(DataRequirement.class);

	/* Constants for each property name. */
	java.lang.String subjectCodeableConcept = "subjectCodeableConcept";
	java.lang.String subjectReference = "subjectReference";
	java.lang.String codeFilter = "codeFilter";
	java.lang.String dateFilter = "dateFilter";
	java.lang.String sort = "sort";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getSubjectCodeableConcept();
	void setSubjectCodeableConcept(fhir.CodeableConcept subjectCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubjectReference();
	void setSubjectReference(com.braintribe.model.generic.GenericEntity subjectReference);
	@Description("Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.")
	
	java.util.List<fhir.DataRequirementCodeFilter> getCodeFilter();
	void setCodeFilter(java.util.List<fhir.DataRequirementCodeFilter> codeFilter);

	@Description("Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.")
	
	java.util.List<fhir.DataRequirementDateFilter> getDateFilter();
	void setDateFilter(java.util.List<fhir.DataRequirementDateFilter> dateFilter);

	@Description("Specifies the order of the results to be returned.")
	
	java.util.List<fhir.DataRequirementSort> getSort();
	void setSort(java.util.List<fhir.DataRequirementSort> sort);

}
