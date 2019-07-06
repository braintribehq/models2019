/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationIsotope of the Data Model fhir.
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
{@link name}, 
{@link substitution}, 
{@link halfLife}, 
{@link molecularWeight}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getName},
{@link getSubstitution},
{@link getHalfLife},
{@link getMolecularWeight},
{@link setIdentifier},
{@link setName},
{@link setSubstitution},
{@link setHalfLife},
{@link setMolecularWeight},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationIsotope extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationIsotope> T = EntityTypes.T(SubstanceSpecificationIsotope.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String name = "name";
	java.lang.String substitution = "substitution";
	java.lang.String halfLife = "halfLife";
	java.lang.String molecularWeight = "molecularWeight";

	@Description("Substance identifier for each non-natural or radioisotope.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Substance name for each non-natural or radioisotope.")
	@Mandatory
	fhir.CodeableConcept getName();
	void setName(fhir.CodeableConcept name);
	@Description("The type of isotopic substitution present in a single substance.")
	@Mandatory
	fhir.CodeableConcept getSubstitution();
	void setSubstitution(fhir.CodeableConcept substitution);
	@Description("Half life - for a non-natural nuclide.")
	@Mandatory
	fhir.Quantity getHalfLife();
	void setHalfLife(fhir.Quantity halfLife);
	@Description("The molecular weight or weight range (for proteins, polymers or nucleic acids).")
	@Mandatory
	fhir.SubstanceSpecificationMolecularWeight getMolecularWeight();
	void setMolecularWeight(fhir.SubstanceSpecificationMolecularWeight molecularWeight);
}
