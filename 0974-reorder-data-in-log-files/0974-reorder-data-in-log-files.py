class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        
        letter_logs = []
        digit_logs = []

        for i in range(0, len(logs)):
            log_splitted =  logs[i].split()
            identifier = ''.join(log_splitted[0])
            current = ' '.join(log_splitted[1:])

            if current.replace(' ', '').isdigit():
                digit_logs.append(logs[i])
            
            else:
                letter_logs.append((identifier, current))
        
        letter_logs = sorted(letter_logs, key = lambda x:(x[1],x[0]))

        letter_logs = [f"{id} {cont}" for id, cont in letter_logs]
        output = letter_logs + digit_logs
        
        
        return output

