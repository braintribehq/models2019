/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcWorkControl of the Data Model iai.
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
{@link CreationDate}, 
{@link Creators}, 
{@link Purpose}, 
{@link Duration}, 
{@link TotalFloat}, 
{@link StartTime}, 
{@link FinishTime}, 

* It provides of then following operations (getters and setters)
{@link getCreationDate},
{@link getCreators},
{@link getPurpose},
{@link getDuration},
{@link getTotalFloat},
{@link getStartTime},
{@link getFinishTime},
{@link setCreationDate},
{@link setCreators},
{@link setPurpose},
{@link setDuration},
{@link setTotalFloat},
{@link setStartTime},
{@link setFinishTime},
 */

@Description("")

public interface IfcWorkControl extends GenericEntity, ifc4.IfcControl {

	EntityType<IfcWorkControl> T = EntityTypes.T(IfcWorkControl.class);

	/* Constants for each property name. */
	java.lang.String CreationDate = "CreationDate";
	java.lang.String Creators = "Creators";
	java.lang.String Purpose = "Purpose";
	java.lang.String Duration = "Duration";
	java.lang.String TotalFloat = "TotalFloat";
	java.lang.String StartTime = "StartTime";
	java.lang.String FinishTime = "FinishTime";

	@Description("")
	@Mandatory
	java.lang.String getCreationDate();
	void setCreationDate(java.lang.String CreationDate);
	@Description("")
	
	java.util.List<ifc4.IfcPerson> getCreators();
	void setCreators(java.util.List<ifc4.IfcPerson> Creators);

	@Description("")
	@Mandatory
	java.lang.String getPurpose();
	void setPurpose(java.lang.String Purpose);
	@Description("")
	@Mandatory
	java.lang.String getDuration();
	void setDuration(java.lang.String Duration);
	@Description("")
	@Mandatory
	java.lang.String getTotalFloat();
	void setTotalFloat(java.lang.String TotalFloat);
	@Description("")
	@Mandatory
	java.lang.String getStartTime();
	void setStartTime(java.lang.String StartTime);
	@Description("")
	@Mandatory
	java.lang.String getFinishTime();
	void setFinishTime(java.lang.String FinishTime);
}
