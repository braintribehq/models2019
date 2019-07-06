/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceProtein of the Data Model fhir.
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
{@link subunit}, 

* It provides of then following operations (getters and setters)
{@link getSequenceType},
{@link getSubunit},
{@link setSequenceType},
{@link setSubunit},
 */

@Description("A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.If the element is present, it must have either a @value, an @id, or extensions")

public interface SubstanceProtein extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SubstanceProtein> T = EntityTypes.T(SubstanceProtein.class);

	/* Constants for each property name. */
	java.lang.String sequenceType = "sequenceType";
	java.lang.String subunit = "subunit";

	@Description("The SubstanceProtein descriptive elements will only be used when a complete or partial amino acid sequence is available or derivable from a nucleic acid sequence.")
	@Mandatory
	fhir.CodeableConcept getSequenceType();
	void setSequenceType(fhir.CodeableConcept sequenceType);
	@Description("This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.")
	
	java.util.List<fhir.SubstanceProteinSubunit> getSubunit();
	void setSubunit(java.util.List<fhir.SubstanceProteinSubunit> subunit);

}
