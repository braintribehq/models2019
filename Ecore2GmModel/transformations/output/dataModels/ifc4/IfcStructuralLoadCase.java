/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadCase of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link SelfWeightCoefficients}, 
{@link SelfWeightCoefficientsAsString}, 

* It provides of then following operations (getters and setters)
{@link getSelfWeightCoefficients},
{@link getSelfWeightCoefficientsAsString},
{@link setSelfWeightCoefficients},
{@link setSelfWeightCoefficientsAsString},
 */

@Description("")

public interface IfcStructuralLoadCase extends GenericEntity, ifc4.IfcStructuralLoadGroup {

	EntityType<IfcStructuralLoadCase> T = EntityTypes.T(IfcStructuralLoadCase.class);

	/* Constants for each property name. */
	java.lang.String SelfWeightCoefficients = "SelfWeightCoefficients";
	java.lang.String SelfWeightCoefficientsAsString = "SelfWeightCoefficientsAsString";

	@Description("")
	
	java.util.List<java.lang.Double> getSelfWeightCoefficients();
	void setSelfWeightCoefficients(java.util.List<java.lang.Double> SelfWeightCoefficients);

	@Description("")
	
	java.util.List<java.lang.String> getSelfWeightCoefficientsAsString();
	void setSelfWeightCoefficientsAsString(java.util.List<java.lang.String> SelfWeightCoefficientsAsString);

}
