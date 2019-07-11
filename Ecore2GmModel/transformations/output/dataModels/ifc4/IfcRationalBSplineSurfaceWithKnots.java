/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRationalBSplineSurfaceWithKnots of the Data Model iai.
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
{@link WeightsData}, 
{@link Weights}, 
{@link WeightsAsString}, 

* It provides of then following operations (getters and setters)
{@link getWeightsData},
{@link getWeights},
{@link getWeightsAsString},
{@link setWeightsData},
{@link setWeights},
{@link setWeightsAsString},
 */

@Description("")

public interface IfcRationalBSplineSurfaceWithKnots extends GenericEntity, ifc4.IfcBSplineSurfaceWithKnots {

	EntityType<IfcRationalBSplineSurfaceWithKnots> T = EntityTypes.T(IfcRationalBSplineSurfaceWithKnots.class);

	/* Constants for each property name. */
	java.lang.String WeightsData = "WeightsData";
	java.lang.String Weights = "Weights";
	java.lang.String WeightsAsString = "WeightsAsString";

	@Description("")
	
	java.util.List<ifc4.ListOfEDouble> getWeightsData();
	void setWeightsData(java.util.List<ifc4.ListOfEDouble> WeightsData);

	@Description("")
	@Mandatory
	java.lang.Double getWeights();
	void setWeights(java.lang.Double Weights);
	@Description("")
	@Mandatory
	java.lang.String getWeightsAsString();
	void setWeightsAsString(java.lang.String WeightsAsString);
}
