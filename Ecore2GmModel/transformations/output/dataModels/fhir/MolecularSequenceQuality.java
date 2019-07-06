/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MolecularSequenceQuality of the Data Model fhir.
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
{@link standardSequence}, 
{@link score}, 
{@link method}, 
{@link roc}, 

* It provides of then following operations (getters and setters)
{@link getStandardSequence},
{@link getScore},
{@link getMethod},
{@link getRoc},
{@link setStandardSequence},
{@link setScore},
{@link setMethod},
{@link setRoc},
 */

@Description("Raw data describing a biological sequence.")

public interface MolecularSequenceQuality extends GenericEntity, fhir.BackboneElement {

	EntityType<MolecularSequenceQuality> T = EntityTypes.T(MolecularSequenceQuality.class);

	/* Constants for each property name. */
	java.lang.String standardSequence = "standardSequence";
	java.lang.String score = "score";
	java.lang.String method = "method";
	java.lang.String roc = "roc";

	@Description("Gold standard sequence used for comparing against.")
	@Mandatory
	fhir.CodeableConcept getStandardSequence();
	void setStandardSequence(fhir.CodeableConcept standardSequence);
	@Description("The score of an experimentally derived feature such as a p-value ([SO:0001685](http://www.sequenceontology.org/browser/current_svn/term/SO:0001685)).")
	@Mandatory
	fhir.Quantity getScore();
	void setScore(fhir.Quantity score);
	@Description("Which method is used to get sequence quality.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
	@Description("Receiver Operator Characteristic (ROC) Curve  to give sensitivity/specificity tradeoff.")
	@Mandatory
	fhir.MolecularSequenceRoc getRoc();
	void setRoc(fhir.MolecularSequenceRoc roc);
}
