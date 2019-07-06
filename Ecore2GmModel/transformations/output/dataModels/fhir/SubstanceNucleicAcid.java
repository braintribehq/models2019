/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceNucleicAcid of the Data Model fhir.
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
{@link sequenceType}, 
{@link oligoNucleotideType}, 
{@link subunit}, 

* It provides of then following operations (getters and setters)
{@link getSequenceType},
{@link getOligoNucleotideType},
{@link getSubunit},
{@link setSequenceType},
{@link setOligoNucleotideType},
{@link setSubunit},
 */

@Description("Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5?-3? direction.If the element is present, it must have either a @value, an @id, or extensions")

public interface SubstanceNucleicAcid extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SubstanceNucleicAcid> T = EntityTypes.T(SubstanceNucleicAcid.class);

	/* Constants for each property name. */
	java.lang.String sequenceType = "sequenceType";
	java.lang.String oligoNucleotideType = "oligoNucleotideType";
	java.lang.String subunit = "subunit";

	@Description("The type of the sequence shall be specified based on a controlled vocabulary.")
	@Mandatory
	fhir.CodeableConcept getSequenceType();
	void setSequenceType(fhir.CodeableConcept sequenceType);
	@Description("(TBC).")
	@Mandatory
	fhir.CodeableConcept getOligoNucleotideType();
	void setOligoNucleotideType(fhir.CodeableConcept oligoNucleotideType);
	@Description("Subunits are listed in order of decreasing length; sequences of the same length will be ordered by molecular weight; subunits that have identical sequences will be repeated multiple times.")
	
	java.util.List<fhir.SubstanceNucleicAcidSubunit> getSubunit();
	void setSubunit(java.util.List<fhir.SubstanceNucleicAcidSubunit> subunit);

}
