package database;

import java.sql.SQLException;
import java.sql.Statement;


class InsertsToDatabase {

    void doInserts(Statement statement) throws SQLException{
        statement.executeUpdate("insert into teams values(1, 'Italy', 9.14)");
        statement.executeUpdate("insert into teams values(2, 'Spain', 9.34)");
        statement.executeUpdate("insert into teams values(3, 'Belgium', 9.8)");
        statement.executeUpdate("insert into teams values(4, 'France', 9.7)");
        statement.executeUpdate("insert into teams values(5, 'Brazil', 9.55)");
        statement.executeUpdate("insert into teams values(6, 'England', 9.49)");
        statement.executeUpdate("insert into teams values(7, 'Portugal', 9.42)");
        statement.executeUpdate("insert into teams values(8, 'Croatia', 9.4)");
        statement.executeUpdate("insert into teams values(9, 'Uruguay', 9.32)");
        statement.executeUpdate("insert into teams values(10, 'Switzerland', 9.3)");
        statement.executeUpdate("insert into teams values(11, 'Denmark', 9.2)");
        statement.executeUpdate("insert into teams values(12, 'Germany', 9.18)");
        statement.executeUpdate("insert into teams values(13, 'Argentina', 9.18)");
        statement.executeUpdate("insert into teams values(14, 'Colombia', 9.17)");
        statement.executeUpdate("insert into teams values(15, 'Netherlands', 9.14)");
        statement.executeUpdate("insert into teams values(16, 'Chile', 9.1)");
        statement.executeUpdate("insert into teams values(17, 'Sweden', 9.09)");
        statement.executeUpdate("insert into teams values(18, 'Mexico', 9.08)");
        statement.executeUpdate("insert into teams values(19, 'Poland', 9.06)");
        statement.executeUpdate("insert into teams values(20, 'Iran', 8.97)");
        statement.executeUpdate("insert into teams values(21, 'Peru', 8.96)");
        statement.executeUpdate("insert into teams values(22, 'Senegal', 8.95)");
        statement.executeUpdate("insert into teams values(23, 'Wales', 8.94)");
        statement.executeUpdate("insert into teams values(24, 'Ukraine', 8.93)");
        statement.executeUpdate("insert into teams values(25, 'Tunisia', 8.9)");
        statement.executeUpdate("insert into teams values(26, 'Austria', 8.88)");
        statement.executeUpdate("insert into teams values(27, 'Romania', 8.87)");
        statement.executeUpdate("insert into teams values(28, 'Northern Ireland', 8.86)");
        statement.executeUpdate("insert into teams values(29, 'Japan', 8.86)");
        statement.executeUpdate("insert into teams values(30, 'USA', 8.85)");
        statement.executeUpdate("insert into teams values(31, 'Slovakia', 8.81)");
        statement.executeUpdate("insert into teams values(32, 'Republic of Ireland', 8.8)");
        statement.executeUpdate("insert into teams values(33, 'Venezuela', 8.78)");
        statement.executeUpdate("insert into teams values(34, 'Serbia', 8.73)");
        statement.executeUpdate("insert into teams values(35, 'Iceland', 8.71)");
        statement.executeUpdate("insert into teams values(36, 'Paraguay', 8.69)");
        statement.executeUpdate("insert into teams values(37, 'Korea Republic', 8.68)");
        statement.executeUpdate("insert into teams values(38, 'Turkey', 8.68)");
        statement.executeUpdate("insert into teams values(39, 'Costa Rica', 8.65)");
        statement.executeUpdate("insert into teams values(40, 'Bosnia and Herzegovina', 8.65)");
        statement.executeUpdate("insert into teams values(41, 'Czech Republic', 8.62)");
        statement.executeUpdate("insert into teams values(42, 'Hungary', 8.6)");
        statement.executeUpdate("insert into teams values(43, 'Australia', 8.55)");
        statement.executeUpdate("insert into teams values(44, 'Russia', 8.55)");
        statement.executeUpdate("insert into teams values(45, 'Scotland', 8.52)");
        statement.executeUpdate("insert into teams values(46, 'Nigeria', 8.52)");
        statement.executeUpdate("insert into teams values(47, 'Morocco', 8.49)");
        statement.executeUpdate("insert into teams values(48, 'Norway', 8.49)");
        statement.executeUpdate("insert into teams values(49, 'Congo DR', 8.46)");
        statement.executeUpdate("insert into teams values(50, 'Ghana', 8.42)");
        statement.executeUpdate("insert into teams values(51, 'Cameroon', 8.39)");
        statement.executeUpdate("insert into teams values(52, 'Greece', 8.38)");
        statement.executeUpdate("insert into teams values(53, 'Montenegro', 8.36)");
        statement.executeUpdate("insert into teams values(54, 'Jamaica', 8.31)");
        statement.executeUpdate("insert into teams values(55, 'Qatar', 8.3)");
        statement.executeUpdate("insert into teams values(56, 'Finland', 8.28)");
        statement.executeUpdate("insert into teams values(57, 'Bulgaria', 8.25)");
        statement.executeUpdate("insert into teams values(58, 'Egypt', 8.22)");
        statement.executeUpdate("insert into teams values(59, 'Burkina Faso', 8.2)");
        statement.executeUpdate("insert into teams values(60, 'Ecuador', 8.18)");
        statement.executeUpdate("insert into teams values(61, 'Honduras', 8.1)");
        statement.executeUpdate("insert into teams values(62, 'Bolivia', 8.07)");
        statement.executeUpdate("insert into teams values(63, 'Mali', 8.07)");
        statement.executeUpdate("insert into teams values(64, 'Cote dIvoire', 8.07)");
        statement.executeUpdate("insert into teams values(65, 'Slovenia', 8.05)");
        statement.executeUpdate("insert into teams values(66, 'Albania', 8.04)");
        statement.executeUpdate("insert into teams values(67, 'United Arab Emirates', 8.02)");
        statement.executeUpdate("insert into teams values(68, 'Algeria', 7.96)");
        statement.executeUpdate("insert into teams values(69, 'El Salvador', 7.92)");
        statement.executeUpdate("insert into teams values(70, 'Saudi Arabia', 7.92)");
        statement.executeUpdate("insert into teams values(71, 'Guinea', 7.88)");
        statement.executeUpdate("insert into teams values(72, 'South Africa', 7.87)");
        statement.executeUpdate("insert into teams values(73, 'China PR', 7.85)");
        statement.executeUpdate("insert into teams values(74, 'North Macedonia', 7.85)");
        statement.executeUpdate("insert into teams values(75, 'Panama', 7.8)");
        statement.executeUpdate("insert into teams values(76, 'Cape Verde Islands', 7.76)");
        statement.executeUpdate("insert into teams values(77, 'Iraq', 7.73)");
        statement.executeUpdate("insert into teams values(78, 'Canada', 7.72)");
        statement.executeUpdate("insert into teams values(79, 'Curacao', 7.67)");
        statement.executeUpdate("insert into teams values(80, 'Uganda', 7.64)");
        statement.executeUpdate("insert into teams values(81, 'Zambia', 7.63)");
        statement.executeUpdate("insert into teams values(82, 'Israel', 7.5)");
        statement.executeUpdate("insert into teams values(83, 'Belarus', 7.5)");
        statement.executeUpdate("insert into teams values(84, 'Uzbekistan', 7.42)");
        statement.executeUpdate("insert into teams values(85, 'Syria', 7.36)");
        statement.executeUpdate("insert into teams values(86, 'Oman', 7.35)");
        statement.executeUpdate("insert into teams values(87, 'Lebanon', 7.35)");
        statement.executeUpdate("insert into teams values(88, 'Benin', 7.3)");
        statement.executeUpdate("insert into teams values(89, 'Gabon', 7.29)");
        statement.executeUpdate("insert into teams values(90, 'Congo', 7.23)");
        statement.executeUpdate("insert into teams values(91, 'Luxembourg', 7.23)");
        statement.executeUpdate("insert into teams values(92, 'Trinidad and Tobago', 7.18)");
        statement.executeUpdate("insert into teams values(93, 'Cyprus', 7.16)");
        statement.executeUpdate("insert into teams values(94, 'Georgia', 7.13)");
        statement.executeUpdate("insert into teams values(95, 'Kyrgyz Republic', 7.1)");
        statement.executeUpdate("insert into teams values(96, 'Vietnam', 7.0)");
        statement.executeUpdate("insert into teams values(97, 'Armenia', 6.98)");
        statement.executeUpdate("insert into teams values(98, 'Jordan', 6.97)");
        statement.executeUpdate("insert into teams values(99, 'Estonia', 6.96)");
        statement.executeUpdate("insert into teams values(100, 'Palestine', 6.92)");
        statement.executeUpdate("insert into teams values(101, 'India', 6.89)");
        statement.executeUpdate("insert into teams values(102, 'Haiti', 6.89)");
        statement.executeUpdate("insert into teams values(103, 'Mauritania', 6.83)");
        statement.executeUpdate("insert into teams values(104, 'Niger', 6.82)");
        statement.executeUpdate("insert into teams values(105, 'Kenya', 6.8)");
        statement.executeUpdate("insert into teams values(106, 'Libya', 6.8)");
        statement.executeUpdate("insert into teams values(107, 'Faroe Islands', 6.75)");
        statement.executeUpdate("insert into teams values(108, 'Madagascar', 6.7)");
        statement.executeUpdate("insert into teams values(109, 'Zimbabwe', 6.65)");
        statement.executeUpdate("insert into teams values(110, 'Bahrain', 6.61)");
        statement.executeUpdate("insert into teams values(111, 'Azerbaijan', 6.61)");
        statement.executeUpdate("insert into teams values(112, 'Central African Republic', 6.57)");
        statement.executeUpdate("insert into teams values(113, 'Namibia', 6.53)");
        statement.executeUpdate("insert into teams values(114, 'Kazakhstan', 6.5)");
        statement.executeUpdate("insert into teams values(115, 'Sierra Leone', 6.48)");
        statement.executeUpdate("insert into teams values(116, 'Thailand', 6.42)");
        statement.executeUpdate("insert into teams values(117, 'Mozambique', 6.4)");
        statement.executeUpdate("insert into teams values(118, 'Guinea-Bissau', 6.35)");
        statement.executeUpdate("insert into teams values(119, 'New Zealand', 6.34)");
        statement.executeUpdate("insert into teams values(120, 'Tajikistan', 6.3)");
        statement.executeUpdate("insert into teams values(121, 'Kosovo', 6.27)");
        statement.executeUpdate("insert into teams values(122, 'Korea DPR', 6.26)");
        statement.executeUpdate("insert into teams values(123, 'Angola', 6.22)");
        statement.executeUpdate("insert into teams values(124, 'Antigua and Barbuda', 6.19)");
        statement.executeUpdate("insert into teams values(125, 'Chinese Taipei', 6.13)");
        statement.executeUpdate("insert into teams values(126, 'Philippines', 6.12)");
        statement.executeUpdate("insert into teams values(127, 'Malawi', 6.12)");
        statement.executeUpdate("insert into teams values(128, 'Togo', 6.09)");
        statement.executeUpdate("insert into teams values(129, 'Nicaragua', 6.03)");
        statement.executeUpdate("insert into teams values(130, 'Sudan', 5.97)");
        statement.executeUpdate("insert into teams values(131, 'Tanzania', 5.98)");
        statement.executeUpdate("insert into teams values(132, 'Lithuania', 5.94)");
        statement.executeUpdate("insert into teams values(133, 'St. Kitts and Nevis', 5.9)");
        statement.executeUpdate("insert into teams values(134, 'Burundi', 5.85)");
        statement.executeUpdate("insert into teams values(135, 'Turkmenistan', 5.84)");
        statement.executeUpdate("insert into teams values(136, 'Rwanda', 5.81)");
        statement.executeUpdate("insert into teams values(137, 'Latvia', 5.79)");
        statement.executeUpdate("insert into teams values(138, 'Myanmar', 5.77)");
        statement.executeUpdate("insert into teams values(139, 'Andorra', 5.74)");
        statement.executeUpdate("insert into teams values(140, 'Solomon Islands', 5.66)");
        statement.executeUpdate("insert into teams values(141, 'Equatorial Guinea', 5.62)");
        statement.executeUpdate("insert into teams values(142, 'Hong Kong', 5.62)");
        statement.executeUpdate("insert into teams values(143, 'Eswatini', 5.62)");
        statement.executeUpdate("insert into teams values(144, 'Yemen', 5.61)");
        statement.executeUpdate("insert into teams values(145, 'Lesotho', 5.59)");
        statement.executeUpdate("insert into teams values(146, 'Guatemala', 5.59)");
        statement.executeUpdate("insert into teams values(147, 'Botswana', 5.56)");
        statement.executeUpdate("insert into teams values(148, 'Comoros', 5.54)");
        statement.executeUpdate("insert into teams values(149, 'Afghanistan', 5.47)");
        statement.executeUpdate("insert into teams values(150, 'Ethiopia', 5.39)");
        statement.executeUpdate("insert into teams values(151, 'Maledives', 5.32)");
        statement.executeUpdate("insert into teams values(152, 'Suriname', 5.31)");
        statement.executeUpdate("insert into teams values(153, 'Liberia', 5.29)");
        statement.executeUpdate("insert into teams values(154, 'Dominican Republic', 5.18)");
        statement.executeUpdate("insert into teams values(155, 'New Caledonia', 5.14)");
        statement.executeUpdate("insert into teams values(156, 'Kuwait', 5.12)");
        statement.executeUpdate("insert into teams values(157, 'Mauritius', 5.1)");
        statement.executeUpdate("insert into teams values(158, 'Tahiti', 5.06)");
        statement.executeUpdate("insert into teams values(159, 'Malaysia', 5.01)");
        statement.executeUpdate("insert into teams values(160, 'Indonesia', 4.97)");
        statement.executeUpdate("insert into teams values(161, 'Gambia', 4.95)");
        statement.executeUpdate("insert into teams values(162, 'Singapore', 4.93)");
        statement.executeUpdate("insert into teams values(163, 'Vanuatu', 4.91)");
        statement.executeUpdate("insert into teams values(164, 'Barbados', 4.9)");
        statement.executeUpdate("insert into teams values(165, 'Nepal', 4.89)");
        statement.executeUpdate("insert into teams values(166, 'Belize', 4.88)");
        statement.executeUpdate("insert into teams values(167, 'Fiji', 4.86)");
        statement.executeUpdate("insert into teams values(168, 'South Sudan', 4.82)");
        statement.executeUpdate("insert into teams values(169, 'Cambodia', 4.81)");
        statement.executeUpdate("insert into teams values(170, 'Moldova', 4.79)");
        statement.executeUpdate("insert into teams values(171, 'Papua New Guinea', 4.78)");
        statement.executeUpdate("insert into teams values(172, 'St. Lucia', 4.7)");
        statement.executeUpdate("insert into teams values(173, 'Grenada', 4.68)");
        statement.executeUpdate("insert into teams values(174, 'Bermuda', 4.62)");
        statement.executeUpdate("insert into teams values(175, 'Cuba', 4.59)");
        statement.executeUpdate("insert into teams values(176, 'Chad', 4.57)");
        statement.executeUpdate("insert into teams values(177, 'Dominica', 4.53)");
        statement.executeUpdate("insert into teams values(178, 'Guyana', 4.53)");
        statement.executeUpdate("insert into teams values(179, 'St. Vincent and the Grenadines', 4.53)");
        statement.executeUpdate("insert into teams values(180, 'Puerto Rico', 4.45)");
        statement.executeUpdate("insert into teams values(181, 'Malta', 4.41)");
        statement.executeUpdate("insert into teams values(182, 'Macau', 4.38)");
        statement.executeUpdate("insert into teams values(183, 'Liechtenstein', 4.33)");
        statement.executeUpdate("insert into teams values(184, 'Bangladesh', 4.33)");
        statement.executeUpdate("insert into teams values(185, 'Sao Tome e Principe', 4.3)");
        statement.executeUpdate("insert into teams values(186, 'Buthan', 4.26)");
        statement.executeUpdate("insert into teams values(187, 'Mongolia', 4.21)");
        statement.executeUpdate("insert into teams values(188, 'Laos', 4.2)");
        statement.executeUpdate("insert into teams values(189, 'Aruba', 4.17)");
        statement.executeUpdate("insert into teams values(190, 'Guam', 4.15)");
        statement.executeUpdate("insert into teams values(191, 'Cook Islands', 4.15)");
        statement.executeUpdate("insert into teams values(192, 'American Samoa', 4.15)");
        statement.executeUpdate("insert into teams values(193, 'Brunei Darussalam', 4.12)");
        statement.executeUpdate("insert into teams values(194, 'Seychelles', 4.07)");
        statement.executeUpdate("insert into teams values(195, 'Samoa', 4.03)");
        statement.executeUpdate("insert into teams values(196, 'Djibouti', 4.03)");
        statement.executeUpdate("insert into teams values(197, 'Montserrat', 4.01)");
        statement.executeUpdate("insert into teams values(198, 'Gibraltar', 3.99)");
        statement.executeUpdate("insert into teams values(199, 'US Virgin Islands', 3.91)");
        statement.executeUpdate("insert into teams values(200, 'Timor-Leste', 3.84)");
        statement.executeUpdate("insert into teams values(201, 'Sri Lanka', 3.75)");
        statement.executeUpdate("insert into teams values(202, 'Eritrea', 3.73)");
        statement.executeUpdate("insert into teams values(203, 'Tonga', 3.73)");
        statement.executeUpdate("insert into teams values(204, 'Somalia', 3.73)");
        statement.executeUpdate("insert into teams values(205, 'Pakistan', 3.7)");
        statement.executeUpdate("insert into teams values(206, 'Cayman Islands', 3.7)");
        statement.executeUpdate("insert into teams values(207, 'British Virgin Islands', 3.7)");
        statement.executeUpdate("insert into teams values(208, 'Turks and Caicos Islands', 3.65)");
        statement.executeUpdate("insert into teams values(209, 'Anguilla', 3.6)");
        statement.executeUpdate("insert into teams values(210, 'Bahamas', 3.57)");
        statement.executeUpdate("insert into teams values(211, 'San Marino', 3.49)");
    }

}
