document.addEventListener('DOMContentLoaded', function() {
  var currentDate = new Date();
  var calendarElement = document.querySelector('.calendar');
  var calendarHTML = generateCalendar(currentDate.getFullYear(), currentDate.getMonth(), currentDate.getDate());
  calendarElement.innerHTML = calendarHTML;
});

function generateCalendar(year, month, currentDate) {
  var calendarHTML = '';
  var firstDay = new Date(year, month, 1);
  var numDays = new Date(year, month + 1, 0).getDate();
  var firstDayOfWeek = firstDay.getDay();
  
  var monthNames = [
    "January", "February", "March", "April", "May", "June", 
    "July", "August", "September", "October", "November", "December"
  ];
  
  calendarHTML += '<table>';
  calendarHTML += '<caption>' + monthNames[month] + ' ' + year + '</caption>';
  calendarHTML += '<tr>';
  calendarHTML += '<th>Sun</th>';
  calendarHTML += '<th>Mon</th>';
  calendarHTML += '<th>Tue</th>';
  calendarHTML += '<th>Wed</th>';
  calendarHTML += '<th>Thu</th>';
  calendarHTML += '<th>Fri</th>';
  calendarHTML += '<th>Sat</th>';
  calendarHTML += '</tr>';

  var dayCount = 1;
  var rowCount = Math.ceil((numDays + firstDayOfWeek) / 7);

  for (var i = 0; i < rowCount; i++) {
    calendarHTML += '<tr>';

    for (var j = 0; j < 7; j++) {
      if ((i === 0 && j < firstDayOfWeek) || dayCount > numDays) {
        calendarHTML += '<td></td>';
      } else {
        if (dayCount === currentDate) {
          calendarHTML += '<td class="current-day">' + dayCount + '</td>';
        } else {
          calendarHTML += '<td>' + dayCount + '</td>';
        }
        dayCount++;
      }
    }

    calendarHTML += '</tr>';
  }

  calendarHTML += '</table>';

  return calendarHTML;
}
