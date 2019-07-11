/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStairFlight of the Data Model iai.
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
{@link NumberOfRisers}, 
{@link NumberOfTreads}, 
{@link RiserHeight}, 
{@link RiserHeightAsString}, 
{@link TreadLength}, 
{@link TreadLengthAsString}, 
{@link PredefinedType}, 

* It provides of then following operations (getters and setters)
{@link getNumberOfRisers},
{@link getNumberOfTreads},
{@link getRiserHeight},
{@link getRiserHeightAsString},
{@link getTreadLength},
{@link getTreadLengthAsString},
{@link getPredefinedType},
{@link setNumberOfRisers},
{@link setNumberOfTreads},
{@link setRiserHeight},
{@link setRiserHeightAsString},
{@link setTreadLength},
{@link setTreadLengthAsString},
{@link setPredefinedType},
 */

@Description("")

public interface IfcStairFlight extends GenericEntity, ifc4.IfcBuildingElement {

	EntityType<IfcStairFlight> T = EntityTypes.T(IfcStairFlight.class);

	/* Constants for each property name. */
	java.lang.String NumberOfRisers = "NumberOfRisers";
	java.lang.String NumberOfTreads = "NumberOfTreads";
	java.lang.String RiserHeight = "RiserHeight";
	java.lang.String RiserHeightAsString = "RiserHeightAsString";
	java.lang.String TreadLength = "TreadLength";
	java.lang.String TreadLengthAsString = "TreadLengthAsString";
	java.lang.String PredefinedType = "PredefinedType";

	@Description("")
	@Mandatory
	java.lang.Long getNumberOfRisers();
	void setNumberOfRisers(java.lang.Long NumberOfRisers);
	@Description("")
	@Mandatory
	java.lang.Long getNumberOfTreads();
	void setNumberOfTreads(java.lang.Long NumberOfTreads);
	@Description("")
	@Mandatory
	java.lang.Double getRiserHeight();
	void setRiserHeight(java.lang.Double RiserHeight);
	@Description("")
	@Mandatory
	java.lang.String getRiserHeightAsString();
	void setRiserHeightAsString(java.lang.String RiserHeightAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTreadLength();
	void setTreadLength(java.lang.Double TreadLength);
	@Description("")
	@Mandatory
	java.lang.String getTreadLengthAsString();
	void setTreadLengthAsString(java.lang.String TreadLengthAsString);
	@Description("")
	@Mandatory
	ifc4.IfcStairFlightTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcStairFlightTypeEnum PredefinedType);
}
