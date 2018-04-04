
public class SGAMember DAO{
	

	private Connection connection;

	public SGAMemberDAO{

		connection = DbConnectionUtil.getConnection();


	}

	public List<SGAMember> getAllSGAMembers(){

		List<SGAMember> sgamembers = new ArrayList<SGAMember>();

		int i = 0;
		in rsCount = 0;
		int j = 0;

		try {

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executableQuery("select * from SGAMemeber")

			while (rs.next()){

				rsCount++;

			}


		} catch (SQL Exception e){


		}

		try {

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executableQuery("select * from SGAMember");

			while (i < rsCount){

				while (rs.next()){

					SGAMember sgamember = new SGAMember();

					sgamember.setSGAMemberID(rs.getInt("SGAMemberID"));

					sgamember.setSGAMember(rs.getString("memberFName"));
					sgamember.setSGAMember(rs.getString("memberLName"));
					sgamember.setSGAMember(rs.getString("memberEmailAddress"));
					sgamember.setSGAMember(rs.getDate("graduationdate"));
					sgamember.setSGAMember(rs.getString("collegeID"));
					sgamember.setSGAMember(rs.getString("branchID"));
					sgamember.setSGAMember(rs.getString("headshotID"));
					sgamember.setSGAMember(rs.getString("committeeID"));
					sgamember.setSGAMember(rs.getString("positionID"));

					sgamembers.add(sgamember);

					i++;
					j++;

				}

			}

		} catch (SQLException){

		}
		return sgamembers;

	}

}